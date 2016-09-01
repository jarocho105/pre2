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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.EstadoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.EstadoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.EstadoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.EstadoActivoFijoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoActivoFijoBeanSwingJInternalFrame extends EstadoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoActivoFijo> estadoactivofijoValidator = new ClassValidator<EstadoActivoFijo>(EstadoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoActivoFijo estadoactivofijo;	
	public EstadoActivoFijo estadoactivofijoAux;
	public EstadoActivoFijo estadoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoActivoFijo estadoactivofijoTotales;
	public Long idEstadoActivoFijoActual;
	public Long iIdNuevoEstadoActivoFijo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleActivoFijo=false;

	public Boolean getIsTienePermisosDetalleActivoFijo() {
		return isTienePermisosDetalleActivoFijo;
	}

	public void setIsTienePermisosDetalleActivoFijo(Boolean isTienePermisosDetalleActivoFijo) {
		this.isTienePermisosDetalleActivoFijo= isTienePermisosDetalleActivoFijo;
	}


	public Boolean isTienePermisosParteActivoFijo=false;

	public Boolean getIsTienePermisosParteActivoFijo() {
		return isTienePermisosParteActivoFijo;
	}

	public void setIsTienePermisosParteActivoFijo(Boolean isTienePermisosParteActivoFijo) {
		this.isTienePermisosParteActivoFijo= isTienePermisosParteActivoFijo;
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
	
	public Boolean isPermisoTodoEstadoActivoFijo;
	public Boolean isPermisoNuevoEstadoActivoFijo;
	public Boolean isPermisoActualizarEstadoActivoFijo;
	public Boolean isPermisoActualizarOriginalEstadoActivoFijo;
	public Boolean isPermisoEliminarEstadoActivoFijo;
	public Boolean isPermisoGuardarCambiosEstadoActivoFijo;
	public Boolean isPermisoConsultaEstadoActivoFijo;
	public Boolean isPermisoBusquedaEstadoActivoFijo;
	public Boolean isPermisoReporteEstadoActivoFijo;
	public Boolean isPermisoPaginacionMedioEstadoActivoFijo;
	public Boolean isPermisoPaginacionAltoEstadoActivoFijo;
	public Boolean isPermisoPaginacionTodoEstadoActivoFijo;
	public Boolean isPermisoCopiarEstadoActivoFijo;
	public Boolean isPermisoVerFormEstadoActivoFijo;
	public Boolean isPermisoDuplicarEstadoActivoFijo;
	public Boolean isPermisoOrdenEstadoActivoFijo;
	
	
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
	
	public EstadoActivoFijoParameterReturnGeneral estadoactivofijoReturnGeneral;
	public EstadoActivoFijoParameterReturnGeneral estadoactivofijoParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}


	public ParteActivoFijoLogic parteactivofijoLogic=null;

	public ParteActivoFijoLogic getParteActivoFijoLogic() {
		return parteactivofijoLogic;
	}

	public void setParteActivoFijoLogic(ParteActivoFijoLogic parteactivofijoLogic) {
		this.parteactivofijoLogic = parteactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioEstadoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoActivoFijoLogic estadoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoActivoFijo estadoactivofijoBean;
	public EstadoActivoFijoConstantesFunciones estadoactivofijoConstantesFunciones;
	//public EstadoActivoFijoParameterReturnGeneral estadoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoActivoFijo> estadoactivofijos;	
	//public List<EstadoActivoFijo> estadoactivofijosEliminados;
	//public List<EstadoActivoFijo> estadoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenEstadoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarEstadoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarEstadoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEstadoActivoFijo() {
		return this.iIdNuevoEstadoActivoFijo;
	}

	public void setiIdNuevoEstadoActivoFijo(Long iIdNuevoEstadoActivoFijo) {
		this.iIdNuevoEstadoActivoFijo = iIdNuevoEstadoActivoFijo;
	}
	
	public Long getidEstadoActivoFijoActual() {
		return this.idEstadoActivoFijoActual;
	}

	public void setidEstadoActivoFijoActual(Long idEstadoActivoFijoActual) {
		this.idEstadoActivoFijoActual = idEstadoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoActivoFijo getestadoactivofijo() {
		return this.estadoactivofijo;
	}

	public void setestadoactivofijo(EstadoActivoFijo estadoactivofijo) {
		this.estadoactivofijo = estadoactivofijo;
	}
	
	public EstadoActivoFijo getestadoactivofijoAux() {
		return this.estadoactivofijoAux;
	}

	public void setestadoactivofijoAux(EstadoActivoFijo estadoactivofijoAux) {
		this.estadoactivofijoAux = estadoactivofijoAux;
	}				
	
	public EstadoActivoFijo getestadoactivofijoAnterior() {
		return this.estadoactivofijoAnterior;
	}

	public void setestadoactivofijoAnterior(EstadoActivoFijo estadoactivofijoAnterior) {
		this.estadoactivofijoAnterior = estadoactivofijoAnterior;
	}	
	
	public EstadoActivoFijo getestadoactivofijoTotales() {
		return this.estadoactivofijoTotales;
	}

	public void setestadoactivofijoTotales(EstadoActivoFijo estadoactivofijoTotales) {
		this.estadoactivofijoTotales = estadoactivofijoTotales;
	}	
	
	public EstadoActivoFijo getestadoactivofijoBean() {
		return this.estadoactivofijoBean;
	}

	public void setestadoactivofijoBean(EstadoActivoFijo estadoactivofijoBean) {
		this.estadoactivofijoBean = estadoactivofijoBean;
	}	
	
	public EstadoActivoFijoParameterReturnGeneral getestadoactivofijoReturnGeneral() {
		return this.estadoactivofijoReturnGeneral;
	}

	public void setestadoactivofijoReturnGeneral(EstadoActivoFijoParameterReturnGeneral estadoactivofijoReturnGeneral) {
		this.estadoactivofijoReturnGeneral = estadoactivofijoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoActivoFijoLogic getEstadoActivoFijoLogic()	{		
		return estadoactivofijoLogic;
	}

	public void setEstadoActivoFijoLogic(EstadoActivoFijoLogic estadoactivofijoLogic) {
		this.estadoactivofijoLogic = estadoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoEstadoActivoFijo() {
		return isEsNuevoEstadoActivoFijo;
	}

	public void setIsEsNuevoEstadoActivoFijo(Boolean isEsNuevoEstadoActivoFijo) {
		this.isEsNuevoEstadoActivoFijo = isEsNuevoEstadoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoActivoFijo() {
		return esParaAccionDesdeFormularioEstadoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoActivoFijo(Boolean esParaAccionDesdeFormularioEstadoActivoFijo) {
		this.esParaAccionDesdeFormularioEstadoActivoFijo = esParaAccionDesdeFormularioEstadoActivoFijo;
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

			if(this.estadoactivofijoSessionBean==null) {
				this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
			}

			if(!this.estadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(estadoactivofijoSessionBean.getlidEmpresaActual());
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

					if(this.estadoactivofijo!=null) {
						this.estadoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
						this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaEstadoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadoActivoFijoGenerico!=null && jComboBoxid_empresaEstadoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadoActivoFijo estadoactivofijo,JComboBox jComboBoxid_empresaEstadoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadoactivofijo.setid_empresa(empresaAux.getId());
				estadoactivofijo.setempresa_descripcion(EstadoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadoactivofijo.setEmpresa(empresaAux);			}
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

					if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { 
					}

					if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
							this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
							this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesEstadoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoActivoFijo(this.estadoactivofijoLogic.getEstadoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoActivoFijo(this.estadoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoactivofijoLogic.setEstadoActivoFijos(this.estadoactivofijos);
			estadoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoActivoFijoParameterReturnGeneral getEstadoActivoFijoParameterGeneral() {
		return this.estadoactivofijoParameterGeneral;
	}
	
	public void setEstadoActivoFijoParameterGeneral(EstadoActivoFijoParameterReturnGeneral estadoactivofijoParameterGeneral) {
		this.estadoactivofijoParameterGeneral = estadoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoActivoFijo() {
		return isPermisoTodoEstadoActivoFijo;
	}

	public void setIsPermisoTodoEstadoActivoFijo(Boolean isPermisoTodoEstadoActivoFijo) {
		this.isPermisoTodoEstadoActivoFijo = isPermisoTodoEstadoActivoFijo;
	}

	public Boolean getIsPermisoNuevoEstadoActivoFijo() {
		return isPermisoNuevoEstadoActivoFijo;
	}

	public void setIsPermisoNuevoEstadoActivoFijo(Boolean isPermisoNuevoEstadoActivoFijo) {
		this.isPermisoNuevoEstadoActivoFijo = isPermisoNuevoEstadoActivoFijo;
	}

	public Boolean getIsPermisoActualizarEstadoActivoFijo() {
		return isPermisoActualizarEstadoActivoFijo;
	}

	public void setIsPermisoActualizarEstadoActivoFijo(Boolean isPermisoActualizarEstadoActivoFijo) {
		this.isPermisoActualizarEstadoActivoFijo = isPermisoActualizarEstadoActivoFijo;
	}

	public Boolean getIsPermisoEliminarEstadoActivoFijo() {
		return isPermisoEliminarEstadoActivoFijo;
	}

	public void setIsPermisoEliminarEstadoActivoFijo(Boolean isPermisoEliminarEstadoActivoFijo) {
		this.isPermisoEliminarEstadoActivoFijo = isPermisoEliminarEstadoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoActivoFijo() {
		return isPermisoGuardarCambiosEstadoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosEstadoActivoFijo(Boolean isPermisoGuardarCambiosEstadoActivoFijo) {
		this.isPermisoGuardarCambiosEstadoActivoFijo = isPermisoGuardarCambiosEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaEstadoActivoFijo() {
		return isPermisoConsultaEstadoActivoFijo;
	}

	public void setIsPermisoConsultaEstadoActivoFijo(Boolean isPermisoConsultaEstadoActivoFijo) {
		this.isPermisoConsultaEstadoActivoFijo = isPermisoConsultaEstadoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaEstadoActivoFijo() {
		return isPermisoBusquedaEstadoActivoFijo;
	}

	public void setIsPermisoBusquedaEstadoActivoFijo(Boolean isPermisoBusquedaEstadoActivoFijo) {
		this.isPermisoBusquedaEstadoActivoFijo = isPermisoBusquedaEstadoActivoFijo;
	}

	public Boolean getIsPermisoReporteEstadoActivoFijo() {
		return isPermisoReporteEstadoActivoFijo;
	}

	public void setIsPermisoReporteEstadoActivoFijo(Boolean isPermisoReporteEstadoActivoFijo) {
		this.isPermisoReporteEstadoActivoFijo = isPermisoReporteEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoActivoFijo() {
		return isPermisoPaginacionMedioEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioEstadoActivoFijo(Boolean isPermisoPaginacionMedioEstadoActivoFijo) {
		this.isPermisoPaginacionMedioEstadoActivoFijo = isPermisoPaginacionMedioEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoActivoFijo() {
		return isPermisoPaginacionTodoEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoEstadoActivoFijo(Boolean isPermisoPaginacionTodoEstadoActivoFijo) {
		this.isPermisoPaginacionTodoEstadoActivoFijo = isPermisoPaginacionTodoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoActivoFijo() {
		return isPermisoPaginacionAltoEstadoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoEstadoActivoFijo(Boolean isPermisoPaginacionAltoEstadoActivoFijo) {
		this.isPermisoPaginacionAltoEstadoActivoFijo = isPermisoPaginacionAltoEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarEstadoActivoFijo() {
		return isPermisoCopiarEstadoActivoFijo;
	}

	public void setIsPermisoCopiarEstadoActivoFijo(Boolean isPermisoCopiarEstadoActivoFijo) {
		this.isPermisoCopiarEstadoActivoFijo = isPermisoCopiarEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormEstadoActivoFijo() {
		return isPermisoVerFormEstadoActivoFijo;
	}

	public void setIsPermisoVerFormEstadoActivoFijo(Boolean isPermisoVerFormEstadoActivoFijo) {
		this.isPermisoVerFormEstadoActivoFijo = isPermisoVerFormEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarEstadoActivoFijo() {
		return isPermisoDuplicarEstadoActivoFijo;
	}

	public void setIsPermisoDuplicarEstadoActivoFijo(Boolean isPermisoDuplicarEstadoActivoFijo) {
		this.isPermisoDuplicarEstadoActivoFijo = isPermisoDuplicarEstadoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenEstadoActivoFijo() {
		return isPermisoOrdenEstadoActivoFijo;
	}

	public void setIsPermisoOrdenEstadoActivoFijo(Boolean isPermisoOrdenEstadoActivoFijo) {
		this.isPermisoOrdenEstadoActivoFijo = isPermisoOrdenEstadoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoActivoFijo() {
		return isVisibilidadCeldaNuevoEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoEstadoActivoFijo(Boolean isVisibilidadCeldaNuevoEstadoActivoFijo) {
		this.isVisibilidadCeldaNuevoEstadoActivoFijo = isVisibilidadCeldaNuevoEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoActivoFijo() {
		return isVisibilidadCeldaDuplicarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoActivoFijo(Boolean isVisibilidadCeldaDuplicarEstadoActivoFijo) {
		this.isVisibilidadCeldaDuplicarEstadoActivoFijo = isVisibilidadCeldaDuplicarEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoActivoFijo() {
		return isVisibilidadCeldaCopiarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarEstadoActivoFijo(Boolean isVisibilidadCeldaCopiarEstadoActivoFijo) {
		this.isVisibilidadCeldaCopiarEstadoActivoFijo = isVisibilidadCeldaCopiarEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoActivoFijo() {
		return isVisibilidadCeldaVerFormEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormEstadoActivoFijo(Boolean isVisibilidadCeldaVerFormEstadoActivoFijo) {
		this.isVisibilidadCeldaVerFormEstadoActivoFijo = isVisibilidadCeldaVerFormEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoActivoFijo() {
		return isVisibilidadCeldaOrdenEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenEstadoActivoFijo(Boolean isVisibilidadCeldaOrdenEstadoActivoFijo) {
		this.isVisibilidadCeldaOrdenEstadoActivoFijo = isVisibilidadCeldaOrdenEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo = isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoActivoFijo() {
		return isVisibilidadCeldaModificarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarEstadoActivoFijo(Boolean isVisibilidadCeldaModificarEstadoActivoFijo) {
		this.isVisibilidadCeldaModificarEstadoActivoFijo = isVisibilidadCeldaModificarEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoActivoFijo() {
		return isVisibilidadCeldaActualizarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarEstadoActivoFijo(Boolean isVisibilidadCeldaActualizarEstadoActivoFijo) {
		this.isVisibilidadCeldaActualizarEstadoActivoFijo = isVisibilidadCeldaActualizarEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoActivoFijo() {
		return isVisibilidadCeldaEliminarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarEstadoActivoFijo(Boolean isVisibilidadCeldaEliminarEstadoActivoFijo) {
		this.isVisibilidadCeldaEliminarEstadoActivoFijo = isVisibilidadCeldaEliminarEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoActivoFijo() {
		return isVisibilidadCeldaCancelarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarEstadoActivoFijo(Boolean isVisibilidadCeldaCancelarEstadoActivoFijo) {
		this.isVisibilidadCeldaCancelarEstadoActivoFijo = isVisibilidadCeldaCancelarEstadoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoActivoFijo() {
		return isVisibilidadCeldaGuardarEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarEstadoActivoFijo(Boolean isVisibilidadCeldaGuardarEstadoActivoFijo) {
		this.isVisibilidadCeldaGuardarEstadoActivoFijo = isVisibilidadCeldaGuardarEstadoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosEstadoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosEstadoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo = isVisibilidadCeldaGuardarCambiosEstadoActivoFijo;
	}
		
	public EstadoActivoFijoSessionBean getestadoactivofijoSessionBean() {
		return this.estadoactivofijoSessionBean;
	}
	
	public void setestadoactivofijoSessionBean(EstadoActivoFijoSessionBean estadoactivofijoSessionBean) {
		this.estadoactivofijoSessionBean=estadoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(EstadoActivoFijo estadoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(EstadoActivoFijo estadoactivofijo,EstadoActivoFijo estadoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoActivoFijo(estadoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoactivofijoAux.setId(estadoactivofijo.getId());
		estadoactivofijoAux.setVersionRow(estadoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoActivoFijo();
		
			int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoactivofijoValidator.getInvalidValues(this.estadoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoactivofijoLogic.setDatosCliente(datosCliente);
			estadoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoactivofijoAux=new  EstadoActivoFijo();
				
				estadoactivofijoAux.setIsNew(true);
				estadoactivofijoAux.setIsChanged(true);
				
				estadoactivofijoAux.setEstadoActivoFijoOriginal(this.estadoactivofijo);
				
				estadoactivofijoAux.setId(this.estadoactivofijo.getId());	
				estadoactivofijoAux.setVersionRow(this.estadoactivofijo.getVersionRow());	
				estadoactivofijoAux.setid_empresa(this.estadoactivofijo.getid_empresa());	
				estadoactivofijoAux.setcodigo(this.estadoactivofijo.getcodigo());	
				estadoactivofijoAux.setnombre(this.estadoactivofijo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoactivofijoAux,estadoactivofijoLogic.getEstadoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoactivofijoAux,estadoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoLogic.saveEstadoActivoFijos();//WithConnection
						//estadoactivofijoLogic.getSetVersionRowEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoactivofijo,estadoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesEstadoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoactivofijoAux=new  EstadoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoactivofijoSessionBean.getEsGuardarRelacionado() && this.estadoactivofijo.getId()>=0)) {
						
					estadoactivofijoAux.setIsNew(false);
				}
				
				estadoactivofijoAux.setIsDeleted(false);
			
				estadoactivofijoAux.setId(this.estadoactivofijo.getId());	
				estadoactivofijoAux.setVersionRow(this.estadoactivofijo.getVersionRow());	
				estadoactivofijoAux.setid_empresa(this.estadoactivofijo.getid_empresa());	
				estadoactivofijoAux.setcodigo(this.estadoactivofijo.getcodigo());	
				estadoactivofijoAux.setnombre(this.estadoactivofijo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoactivofijoAux,estadoactivofijoLogic.getEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoactivofijoAux,estadoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoLogic.saveEstadoActivoFijos();//WithConnection
						//estadoactivofijoLogic.getSetVersionRowEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoactivofijo,estadoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesEstadoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoactivofijoAux=new  EstadoActivoFijo();
				
				estadoactivofijoAux.setIsNew(false);
				estadoactivofijoAux.setIsChanged(false);
				
				estadoactivofijoAux.setIsDeleted(true);
				
				estadoactivofijoAux.setId(this.estadoactivofijo.getId());	
				estadoactivofijoAux.setVersionRow(this.estadoactivofijo.getVersionRow());	
				estadoactivofijoAux.setid_empresa(this.estadoactivofijo.getid_empresa());	
				estadoactivofijoAux.setcodigo(this.estadoactivofijo.getcodigo());	
				estadoactivofijoAux.setnombre(this.estadoactivofijo.getnombre());	
				
				if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoactivofijoAux.getId()>=0) {	
						this.estadoactivofijosEliminados.add(estadoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoactivofijoAux,estadoactivofijoLogic.getEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoactivofijoAux,estadoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoLogic.saveEstadoActivoFijos();//WithConnection
						//estadoactivofijoLogic.getSetVersionRowEstadoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());

							if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoactivofijoAux.setParteActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoLogic.getParteActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoactivofijoAux,estadoactivofijoLogic.getEstadoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoactivofijoAux,estadoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getEstadoActivoFijos().addAll(this.estadoactivofijosEliminados);
					
					estadoactivofijoLogic.saveEstadoActivoFijos();//WithConnection
					//estadoactivofijoLogic.getSetVersionRowEstadoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoActivoFijo();
				
				this.estadoactivofijosEliminados= new ArrayList<EstadoActivoFijo>();		
			}
			
			if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoactivofijo=estadoactivofijoAux;
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
      		//this.finishProcessEstadoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoActivoFijo estadoactivofijoLocal) throws Exception {
		
		if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
				estadoactivofijoLocal.setParteActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoLogic.getParteActivoFijos());
			
			} else {
			
				estadoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);
				estadoactivofijoLocal.setParteActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoActivoFijo estadoactivofijoLocal) throws Exception {	
		if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoactivofijoValidator.getInvalidValues(this.estadoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoActivoFijo estadoactivofijo,List<EstadoActivoFijo> estadoactivofijos) throws Exception {
		try	{		
			EstadoActivoFijoConstantesFunciones.actualizarLista(estadoactivofijo,estadoactivofijos,this.estadoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoActivoFijo estadoactivofijo,List<EstadoActivoFijo> estadoactivofijos) throws Exception {
		try	{			
			EstadoActivoFijoConstantesFunciones.actualizarSelectedLista(estadoactivofijo,estadoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoActivoFijo> estadoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoactivofijosLocal=this.estadoactivofijoLogic.getEstadoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoactivofijosLocal=this.estadoactivofijos;
			}
			//ARCHITECTURE
		
			for(EstadoActivoFijo estadoactivofijoLocal:estadoactivofijosLocal) {
				if(this.permiteMantenimiento(estadoactivofijoLocal) && estadoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoActivoFijoConstantesFunciones.getEstadoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelid_empresaEstadoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoActivoFijoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelcodigoEstadoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelnombreEstadoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelid_empresaEstadoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelcodigoEstadoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelnombreEstadoActivoFijo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.estadoactivofijo==null) {
				this.estadoactivofijo= new EstadoActivoFijo();
			}

			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoActivoFijo
				this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);

				this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setEstadoActivoFijo(this.estadoactivofijo);
			}

			return;
		}
		 else  if(sTipo.equals("ParteActivoFijo")) {
			if(this.estadoactivofijo==null) {
				this.estadoactivofijo= new EstadoActivoFijo();
			}

			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoActivoFijo
				this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);

				this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.getparteactivofijo().setEstadoActivoFijo(this.estadoactivofijo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoActivoFijo--;	
		
		
		this.estadoactivofijoAux=new EstadoActivoFijo();
		
		this.estadoactivofijoAux.setId(this.iIdNuevoEstadoActivoFijo);
		this.estadoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoactivofijoLogic.getEstadoActivoFijos().add(this.estadoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoactivofijos.add(this.estadoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.estadoactivofijo=this.estadoactivofijoAux;
		
		if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoActivoFijo(this.estadoactivofijo);
		}
				
		//this.setDefaultControlesEstadoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoActivoFijo(this.estadoactivofijoBean,this.estadoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoactivofijoReturnGeneral=estadoactivofijoLogic.procesarEventosEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoactivofijoLogic.getEstadoActivoFijos(),this.estadoactivofijo,this.estadoactivofijoParameterGeneral,this.isEsNuevoEstadoActivoFijo,classes);//this.estadoactivofijoLogic.getEstadoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoActivoFijo(this.estadoactivofijoReturnGeneral,this.estadoactivofijoBean,false);
		
		if(this.estadoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo());
		}
		
		if(this.estadoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo(),classes);//this.estadoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoActivoFijo(false);
						
			if(estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.getEsGuardarRelacionado() && ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParteActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoActivoFijo();
			}
			
			this.actualizarVisualTableDatosEstadoActivoFijo();
			
			this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoEstadoActivoFijo(), this.getIndiceNuevoEstadoActivoFijo());
			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setEnabled(isHabilitar && this.estadoactivofijoConstantesFunciones.activarcodigoEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setEnabled(isHabilitar && this.estadoactivofijoConstantesFunciones.activarnombreEstadoActivoFijo);	
		//
		this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setEnabled(isHabilitar && this.estadoactivofijoConstantesFunciones.activarid_empresaEstadoActivoFijo);
	};
	
	public void setDefaultControlesEstadoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.estadoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.estadoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
				if(estadoactivofijoAux.getId().equals(this.iIdNuevoEstadoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijos) {
				if(estadoactivofijoAux.getId().equals(this.iIdNuevoEstadoActivoFijo)) {
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
	
	public int getIndiceActualEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
				if(estadoactivofijoAux.getId().equals(estadoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijos) {
				if(estadoactivofijoAux.getId().equals(estadoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoActivoFijo(EstadoActivoFijo estadoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
				if(estadoactivofijoAux.getEstadoActivoFijoOriginal().getId().equals(estadoactivofijoOriginal.getId())) {
					existe=true;
					estadoactivofijoOriginal.setId(estadoactivofijoAux.getId());
					estadoactivofijoOriginal.setVersionRow(estadoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijos) {
				if(estadoactivofijoAux.getEstadoActivoFijoOriginal().getId().equals(estadoactivofijoOriginal.getId())) {
					existe=true;
					estadoactivofijoOriginal.setId(estadoactivofijoAux.getId());
					estadoactivofijoOriginal.setVersionRow(estadoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoActivoFijo(Boolean esParaCancelar) throws Exception {
		estadoactivofijosAux=new ArrayList<EstadoActivoFijo>();
		estadoactivofijoAux=new EstadoActivoFijo();
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
					if(estadoactivofijoAux.getId()<0) {
						estadoactivofijosAux.add(estadoactivofijoAux);
					}		
				}
				this.iIdNuevoEstadoActivoFijo=0L;
				this.estadoactivofijoLogic.getEstadoActivoFijos().removeAll(estadoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijos) {
					if(estadoactivofijoAux.getId()<0) {
						estadoactivofijosAux.add(estadoactivofijoAux);
					}		
				}
				this.iIdNuevoEstadoActivoFijo=0L;
				this.estadoactivofijos.removeAll(estadoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoActivoFijo 
					&& this.estadoactivofijoLogic.getEstadoActivoFijos().size()>0
					) {
					estadoactivofijoAux=this.estadoactivofijoLogic.getEstadoActivoFijos().get(this.estadoactivofijoLogic.getEstadoActivoFijos().size() - 1);
				
					if(estadoactivofijoAux.getId()<0) {
						this.estadoactivofijoLogic.getEstadoActivoFijos().remove(estadoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoActivoFijo && this.estadoactivofijos.size()>0) {
					estadoactivofijoAux=this.estadoactivofijos.get(this.estadoactivofijos.size() - 1);
				
					if(estadoactivofijoAux.getId()<0) {
						this.estadoactivofijos.remove(estadoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoactivofijo.getId()<0) {
				this.estadoactivofijoLogic.getEstadoActivoFijos().remove(this.estadoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoactivofijo.getId()<0) {
				this.estadoactivofijos.remove(this.estadoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoActivoFijo(List<EstadoActivoFijo> estadoactivofijosAux) throws Exception {
		EstadoActivoFijoConstantesFunciones.setEstadosInicialesEstadoActivoFijo(estadoactivofijosAux);
	}
	
	public void setEstadosInicialesEstadoActivoFijo(EstadoActivoFijo estadoactivofijoAux) throws Exception {
		EstadoActivoFijoConstantesFunciones.setEstadosInicialesEstadoActivoFijo(estadoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoActivoFijoActual()) {
				if(!this.isEsNuevoEstadoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Activo Fijo ?", "MANTENIMIENTO DE Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoActivoFijo estadoactivofijo) throws Exception {
		EstadoActivoFijoConstantesFunciones.seleccionarAsignar(this.estadoactivofijo,estadoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoActivoFijo=this.isPermisoActualizarOriginalEstadoActivoFijo;
			
			
			this.seleccionarAsignar(estadoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoActivoFijoConstantesFunciones.quitarEspaciosEstadoActivoFijo(this.estadoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoactivofijoSessionBean.setsFuncionBusquedaRapida(this.estadoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoActivoFijo(esParaCancelar);				
				this.cancelarNuevoEstadoActivoFijo(esParaCancelar);								
			}
			
			this.estadoactivofijo=new EstadoActivoFijo();
			
			this.inicializarEstadoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoActivoFijo() throws Exception {
		try {
			EstadoActivoFijoConstantesFunciones.inicializarEstadoActivoFijo(this.estadoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoactivofijoLogic.getEstadoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoActivoFijos(String sAccionBusqueda,List<EstadoActivoFijo> estadoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Activo Fijos");		
		parameters.put("busquedapor", EstadoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleActivoFijo.class));
			classes.add(new Classe(ParteActivoFijo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoActivoFijoLogic estadoactivofijoLogicAuxiliar=new EstadoActivoFijoLogic();
					estadoactivofijoLogicAuxiliar.setDatosCliente(estadoactivofijoLogic.getDatosCliente());				
					estadoactivofijoLogicAuxiliar.setEstadoActivoFijos(estadoactivofijosParaReportes);
					
					estadoactivofijoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoActivoFijoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoactivofijosParaReportes=estadoactivofijoLogicAuxiliar.getEstadoActivoFijos();
					
					//estadoactivofijoLogic.getNewConnexionToDeep();
					
					//for (EstadoActivoFijo estadoactivofijo:estadoactivofijosParaReportes) {
					//	estadoactivofijoLogic.deepLoad(estadoactivofijo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoactivofijoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoactivofijoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleActivoFijo = AuxiliarReportes.class.getResourceAsStream("DetalleActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleactivofijo", reportFileDetalleActivoFijo);

			InputStream reportFileParteActivoFijo = AuxiliarReportes.class.getResourceAsStream("ParteActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parteactivofijo", reportFileParteActivoFijo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoActivoFijo=new JRBeanArrayDataSource(EstadoActivoFijoJInternalFrame.TraerEstadoActivoFijoBeans(estadoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoActivoFijoBean.TraerEstadoActivoFijoBeans(estadoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijoActionPerformed(null);
					//this.generarExcelReporteEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,estadoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoActivoFijo> estadoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoActivoFijo estadoactivofijo : estadoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoActivoFijoConstantesFunciones.generarExcelReporteDataEstadoActivoFijo("NORMAL",row,workbook,estadoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		EstadoActivoFijoConstantesFunciones.generarExcelReporteHeaderEstadoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoActivoFijo> estadoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoActivoFijo estadoactivofijo : estadoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoActivoFijoConstantesFunciones.getEstadoActivoFijoDescripcion(estadoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoactivofijo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoactivofijo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoActivoFijo> estadoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoActivoFijo> estadoactivofijosRespaldo=null;
		
		classes=EstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.estadoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.estadoactivofijoLogic.setIsConDeep(true);
		
		estadoactivofijosRespaldo=this.estadoactivofijoLogic.getEstadoActivoFijos();
		
		this.estadoactivofijoLogic.setEstadoActivoFijos(estadoactivofijosParaReportes);	
		this.estadoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoactivofijosParaReportes=this.estadoactivofijoLogic.getEstadoActivoFijos();
		this.estadoactivofijoLogic.setEstadoActivoFijos(estadoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoActivoFijo estadoactivofijo : estadoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoActivoFijoConstantesFunciones.generarExcelReporteDataEstadoActivoFijo("NORMAL",row,workbook,estadoactivofijo,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoactivofijo.getDetalleActivoFijos()!=null && estadoactivofijo.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(estadoactivofijo.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : estadoactivofijo.getDetalleActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleActivoFijoConstantesFunciones.generarExcelReporteDataDetalleActivoFijo("RELACIONADO",row,workbook,detalleactivofijo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParteActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoactivofijo.getParteActivoFijos()!=null && estadoactivofijo.getParteActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParteActivoFijoConstantesFunciones.generarExcelReporteHeaderParteActivoFijo("RELACIONADO",row,workbook);
				}

				if(estadoactivofijo.getParteActivoFijos()!=null) {
					i2=0;
					for(ParteActivoFijo parteactivofijo : estadoactivofijo.getParteActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParteActivoFijoConstantesFunciones.generarExcelReporteDataParteActivoFijo("RELACIONADO",row,workbook,parteactivofijo,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoActivoFijoConstantesFunciones.getEstadoActivoFijoDescripcion(estadoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoActivoFijo() throws Exception {		
		this.startProcessEstadoActivoFijo(true);
	}
	
	public void startProcessEstadoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoActivoFijo ,this.jPanelParametrosReportesEstadoActivoFijo, this.jScrollPanelDatosEstadoActivoFijo,this.jPanelPaginacionEstadoActivoFijo, this.jScrollPanelDatosEdicionEstadoActivoFijo, this.jPanelAccionesEstadoActivoFijo,this.jPanelAccionesFormularioEstadoActivoFijo,this.jmenuBarEstadoActivoFijo,this.jmenuBarDetalleEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoActivoFijo=this.jTabbedPaneBusquedasEstadoActivoFijo; 
		
		final JPanel jPanelParametrosReportesEstadoActivoFijo=this.jPanelParametrosReportesEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEstadoActivoFijo=this.jScrollPanelDatosEstadoActivoFijo;
		final JTable jTableDatosEstadoActivoFijo=this.jTableDatosEstadoActivoFijo;		
		final JPanel jPanelPaginacionEstadoActivoFijo=this.jPanelPaginacionEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionEstadoActivoFijo=this.jScrollPanelDatosEdicionEstadoActivoFijo;
		final JPanel jPanelAccionesEstadoActivoFijo=this.jPanelAccionesEstadoActivoFijo;
		
		JPanel jPanelCamposAuxiliarEstadoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			jPanelCamposAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelCamposEstadoActivoFijo;
			jPanelAccionesFormularioAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelAccionesFormularioEstadoActivoFijo;
		}
		
		final JPanel jPanelCamposEstadoActivoFijo=jPanelCamposAuxiliarEstadoActivoFijo;
		final JPanel jPanelAccionesFormularioEstadoActivoFijo=jPanelAccionesFormularioAuxiliarEstadoActivoFijo;
		
		
		final JMenuBar jmenuBarEstadoActivoFijo=this.jmenuBarEstadoActivoFijo;
		final JToolBar jTtoolBarEstadoActivoFijo=this.jTtoolBarEstadoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jmenuBarDetalleEstadoActivoFijo;
			jTtoolBarDetalleAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jTtoolBarDetalleEstadoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleEstadoActivoFijo=jmenuBarDetalleAuxiliarEstadoActivoFijo;
		final JToolBar jTtoolBarDetalleEstadoActivoFijo=jTtoolBarDetalleAuxiliarEstadoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoActivoFijo;
			processRunnable.jTableDatos=jTableDatosEstadoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposEstadoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarEstadoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoActivoFijo ,jPanelParametrosReportesEstadoActivoFijo,jTableDatosEstadoActivoFijo, /*jScrollPanelDatosEstadoActivoFijo,*/jPanelCamposEstadoActivoFijo,jPanelPaginacionEstadoActivoFijo, /*jScrollPanelDatosEdicionEstadoActivoFijo,*/ jPanelAccionesEstadoActivoFijo,jPanelAccionesFormularioEstadoActivoFijo,jmenuBarEstadoActivoFijo,jmenuBarDetalleEstadoActivoFijo,jTtoolBarEstadoActivoFijo,jTtoolBarDetalleEstadoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoActivoFijo ,jPanelParametrosReportesEstadoActivoFijo, jScrollPanelDatosEstadoActivoFijo,jPanelPaginacionEstadoActivoFijo, jScrollPanelDatosEdicionEstadoActivoFijo, jPanelAccionesEstadoActivoFijo,jPanelAccionesFormularioEstadoActivoFijo,jmenuBarEstadoActivoFijo,jmenuBarDetalleEstadoActivoFijo,jTtoolBarEstadoActivoFijo,jTtoolBarDetalleEstadoActivoFijo);
						
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
	
	public void finishProcessEstadoActivoFijo() {// throws Exception 
		this.finishProcessEstadoActivoFijo(true);
	}
	
	public void finishProcessEstadoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoActivoFijo ,this.jPanelParametrosReportesEstadoActivoFijo, this.jScrollPanelDatosEstadoActivoFijo,this.jPanelPaginacionEstadoActivoFijo, this.jScrollPanelDatosEdicionEstadoActivoFijo, this.jPanelAccionesEstadoActivoFijo,this.jPanelAccionesFormularioEstadoActivoFijo,this.jmenuBarEstadoActivoFijo,this.jmenuBarDetalleEstadoActivoFijo,this.jTtoolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoActivoFijo=this.jTabbedPaneBusquedasEstadoActivoFijo; 
		
		final JPanel jPanelParametrosReportesEstadoActivoFijo=this.jPanelParametrosReportesEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEstadoActivoFijo=this.jScrollPanelDatosEstadoActivoFijo;
		final JTable jTableDatosEstadoActivoFijo=this.jTableDatosEstadoActivoFijo;		
		final JPanel jPanelPaginacionEstadoActivoFijo=this.jPanelPaginacionEstadoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionEstadoActivoFijo=this.jScrollPanelDatosEdicionEstadoActivoFijo;
		final JPanel jPanelAccionesEstadoActivoFijo=this.jPanelAccionesEstadoActivoFijo;
		
		JPanel jPanelCamposAuxiliarEstadoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			jPanelCamposAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelCamposEstadoActivoFijo;
			jPanelAccionesFormularioAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelAccionesFormularioEstadoActivoFijo;
		}
		
		final JPanel jPanelCamposEstadoActivoFijo=jPanelCamposAuxiliarEstadoActivoFijo;
		final JPanel jPanelAccionesFormularioEstadoActivoFijo=jPanelAccionesFormularioAuxiliarEstadoActivoFijo;
		
		
		final JMenuBar jmenuBarEstadoActivoFijo=this.jmenuBarEstadoActivoFijo;		
		final JToolBar jTtoolBarEstadoActivoFijo=this.jTtoolBarEstadoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jmenuBarDetalleEstadoActivoFijo;
			jTtoolBarDetalleAuxiliarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jTtoolBarDetalleEstadoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoActivoFijo=jmenuBarDetalleAuxiliarEstadoActivoFijo;
		final JToolBar jTtoolBarDetalleEstadoActivoFijo=jTtoolBarDetalleAuxiliarEstadoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoActivoFijo;
			processRunnable.jTableDatos=jTableDatosEstadoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposEstadoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarEstadoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoActivoFijo ,jPanelParametrosReportesEstadoActivoFijo, jTableDatosEstadoActivoFijo,/*jScrollPanelDatosEstadoActivoFijo,*/jPanelCamposEstadoActivoFijo,jPanelPaginacionEstadoActivoFijo, /*jScrollPanelDatosEdicionEstadoActivoFijo,*/ jPanelAccionesEstadoActivoFijo,jPanelAccionesFormularioEstadoActivoFijo,jmenuBarEstadoActivoFijo,jmenuBarDetalleEstadoActivoFijo,jTtoolBarEstadoActivoFijo,jTtoolBarDetalleEstadoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoactivofijoConstantesFunciones.getsFinalQueryEstadoActivoFijo();
		String  finalQueryPaginacionTodos=this.estadoactivofijoConstantesFunciones.getsFinalQueryEstadoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoEstadoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoActivoFijoConstantesFunciones.getArrayColumnasGlobalesEstadoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoactivofijosEliminados= new ArrayList<EstadoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoActivoFijo();
		
				///*EstadoActivoFijoSessionBean*/this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
			
			if(this.estadoactivofijoSessionBean==null) {
				this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=EstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoActivoFijoConstantesFunciones.getClassesForeignKeysOfEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoactivofijosAux= new ArrayList<EstadoActivoFijo>();
			
				
			estadoactivofijoLogic.setDatosCliente(this.datosCliente);
			estadoactivofijoLogic.setDatosDeep(this.datosDeep);
			estadoactivofijoLogic.setIsConDeep(true);
			
			
			estadoactivofijoLogic.getEstadoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoactivofijoLogic.getTodosEstadoActivoFijos(finalQueryGlobal,pagination);
					
					//estadoactivofijoLogic.getTodosEstadoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoactivofijoLogic.getEstadoActivoFijos()==null|| estadoactivofijoLogic.getEstadoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoactivofijosAux= new ArrayList<EstadoActivoFijo>();
							estadoactivofijosAux.addAll(estadoactivofijoLogic.getEstadoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoactivofijosAux= new ArrayList<EstadoActivoFijo>();
							estadoactivofijosAux.addAll(estadoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoactivofijoLogic.getTodosEstadoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//estadoactivofijoLogic.getTodosEstadoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoActivoFijos("Todos",estadoactivofijoLogic.getEstadoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoactivofijoLogic.setEstadoActivoFijos(new ArrayList<EstadoActivoFijo>());					
							estadoactivofijoLogic.getEstadoActivoFijos().addAll(estadoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoactivofijos=new ArrayList<EstadoActivoFijo>();
							estadoactivofijos.addAll(estadoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoActivoFijo=this.idActual;
				
				} else if(this.idEstadoActivoFijoActual!=null && this.idEstadoActivoFijoActual!=0L) {
					idEstadoActivoFijo=idEstadoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndicePorId(idEstadoActivoFijo);
				
				this.estadoactivofijos=new ArrayList<EstadoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoactivofijoLogic.getEntity(idEstadoActivoFijo);
					
					//estadoactivofijoLogic.getEntityWithConnection(idEstadoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoactivofijoLogic.setEstadoActivoFijos(new ArrayList<EstadoActivoFijo>());
					estadoactivofijoLogic.getEstadoActivoFijos().add(estadoactivofijoLogic.getEstadoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoactivofijos=new ArrayList<EstadoActivoFijo>();
					this.estadoactivofijos.add(estadoactivofijo);
				}
				
				if(estadoactivofijoLogic.getEstadoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadoactivofijoLogic.getEstadoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadoactivofijoLogic.getEstadoActivoFijos()==null||estadoactivofijoLogic.getEstadoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadoactivofijos==null|| estadoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijosAux=new ArrayList<EstadoActivoFijo>();
						estadoactivofijosAux.addAll(estadoactivofijoLogic.getEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoactivofijosAux=new ArrayList<EstadoActivoFijo>();
							estadoactivofijosAux.addAll(estadoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadoactivofijoLogic.getEstadoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoActivoFijos("FK_IdEmpresa",estadoactivofijoLogic.getEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoActivoFijos("FK_IdEmpresa",estadoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoLogic.setEstadoActivoFijos(new ArrayList<EstadoActivoFijo>());
						estadoactivofijoLogic.getEstadoActivoFijos().addAll(estadoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoactivofijos=new ArrayList<EstadoActivoFijo>();
							estadoactivofijos.addAll(estadoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoactivofijoLogic.getEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoactivofijoLogic.getEstadoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoActivoFijo estadoactivofijo) {
		Boolean permite=true;
		
		if(this.estadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoActivoFijoConstantesFunciones.getOrderByListaEstadoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoActivoFijoConstantesFunciones.getOrderByListaEstadoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoActivoFijo estadoactivofijo:estadoactivofijoLogic.getEstadoActivoFijos()) {
				if(estadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoactivofijoTotales=estadoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoActivoFijo estadoactivofijo:this.estadoactivofijos) {
				if(estadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoactivofijoTotales=estadoactivofijo;
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
			this.estadoactivofijoAux=new EstadoActivoFijo();
			this.estadoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.estadoactivofijoAux.setIsNew(false);
			this.estadoactivofijoAux.setIsChanged(false);
			this.estadoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoActivoFijoConstantesFunciones.TotalizarValoresFilaEstadoActivoFijo(this.estadoactivofijoLogic.getEstadoActivoFijos(),this.estadoactivofijoAux);
				
				this.estadoactivofijoLogic.getEstadoActivoFijos().add(this.estadoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoActivoFijoConstantesFunciones.TotalizarValoresFilaEstadoActivoFijo(this.estadoactivofijos,this.estadoactivofijoAux);
				
				this.estadoactivofijos.add(this.estadoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoactivofijoTotales=new EstadoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoactivofijoLogic.getEstadoActivoFijos().remove(estadoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoactivofijos.remove(estadoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoactivofijoTotales=new EstadoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoActivoFijo estadoactivofijo:estadoactivofijoLogic.getEstadoActivoFijos()) {
				if(estadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoactivofijoTotales=estadoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoActivoFijoConstantesFunciones.TotalizarValoresFilaEstadoActivoFijo(this.estadoactivofijoLogic.getEstadoActivoFijos(),estadoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoActivoFijo estadoactivofijo:this.estadoactivofijos) {
				if(estadoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					estadoactivofijoTotales=estadoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoActivoFijoConstantesFunciones.TotalizarValoresFilaEstadoActivoFijo(this.estadoactivofijos,estadoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoactivofijoLogic.getEstadoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEstadoActivoFijo() {
		this.isPermisoTodoEstadoActivoFijo=false;
		this.isPermisoNuevoEstadoActivoFijo=false;
		this.isPermisoActualizarEstadoActivoFijo=false;
		this.isPermisoActualizarOriginalEstadoActivoFijo=false;
		this.isPermisoEliminarEstadoActivoFijo=false;
		this.isPermisoGuardarCambiosEstadoActivoFijo=false;
		this.isPermisoConsultaEstadoActivoFijo=false;
		this.isPermisoBusquedaEstadoActivoFijo=false;
		this.isPermisoReporteEstadoActivoFijo=false;		
		this.isPermisoOrdenEstadoActivoFijo=false;		
		this.isPermisoPaginacionMedioEstadoActivoFijo=false;		
		this.isPermisoPaginacionAltoEstadoActivoFijo=false;
		this.isPermisoPaginacionTodoEstadoActivoFijo=false;
		this.isPermisoCopiarEstadoActivoFijo=false;		
		this.isPermisoVerFormEstadoActivoFijo=false;		
		this.isPermisoDuplicarEstadoActivoFijo=false;		
		this.isPermisoOrdenEstadoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioEstadoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoEstadoActivoFijo=isPermiso;
		this.isPermisoNuevoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalEstadoActivoFijo=isPermiso;
		this.isPermisoEliminarEstadoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosEstadoActivoFijo=isPermiso;
		this.isPermisoConsultaEstadoActivoFijo=isPermiso;
		this.isPermisoBusquedaEstadoActivoFijo=isPermiso;
		this.isPermisoReporteEstadoActivoFijo=isPermiso;
		this.isPermisoOrdenEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoEstadoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoEstadoActivoFijo=isPermiso;		
		this.isPermisoCopiarEstadoActivoFijo=isPermiso;		
		this.isPermisoVerFormEstadoActivoFijo=isPermiso;		
		this.isPermisoDuplicarEstadoActivoFijo=isPermiso;
		this.isPermisoOrdenEstadoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoEstadoActivoFijo=isPermiso;
		this.isPermisoNuevoEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarEstadoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalEstadoActivoFijo=isPermiso;
		this.isPermisoEliminarEstadoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosEstadoActivoFijo=isPermiso;
		//this.isPermisoConsultaEstadoActivoFijo=isPermiso;
		//this.isPermisoBusquedaEstadoActivoFijo=isPermiso;
		//this.isPermisoReporteEstadoActivoFijo=isPermiso;
		//this.isPermisoOrdenEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoActivoFijo=isPermiso;		
		//this.isPermisoCopiarEstadoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarEstadoActivoFijo=isPermiso;
		//this.isPermisoOrdenEstadoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParteActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleActivoFijo=false;
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionEstadoActivoFijoClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParteActivoFijo=false;
		this.isTienePermisosParteActivoFijo=this.verificarGetPermisosUsuarioOpcionEstadoActivoFijoClaseRelacionada(this.opcionsRelacionadas,ParteActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
		this.isTienePermisosParteActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoActivoFijoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.remove(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParteActivoFijo && this.jInternalFrameDetalleFormEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.remove(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoActivoFijo=this.isPermisoActualizarEstadoActivoFijo;
			this.isPermisoEliminarEstadoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoActivoFijo.setToolTipText(this.jTableDatosEstadoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoActivoFijo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarDetalleActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Activo Fijo");
			reporte.setsDescripcion("Detalle Activo Fijo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParteActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarParteActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parte Activo Fijo");
			reporte.setsDescripcion("Parte Activo Fijo");
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
	public void inicializarCombosForeignKeyEstadoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEstadoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoActivoFijoParameterReturnGeneral estadoactivofijoReturnGeneral=new EstadoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.estadoactivofijoConstantesFunciones.cargarid_empresaEstadoActivoFijo)
					 || (this.esRecargarFks && this.estadoactivofijoConstantesFunciones.cargarid_empresaEstadoActivoFijo)) {

					if(!this.estadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+estadoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadoactivofijoReturnGeneral=estadoactivofijoLogic.cargarCombosLoteForeignKeyEstadoActivoFijo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=estadoactivofijoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadoactivofijoSessionBean==null) {
				this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
			}

			if(!this.estadoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyEstadoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoActivoFijo(EstadoActivoFijo estadoactivofijo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoActivoFijo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EstadoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean(); 
		this.estadoactivofijoConstantesFunciones=new EstadoActivoFijoConstantesFunciones(); 
		this.estadoactivofijoBean=new EstadoActivoFijo();//(this.estadoactivofijoConstantesFunciones); 		
		this.estadoactivofijoReturnGeneral=new EstadoActivoFijoParameterReturnGeneral(); 
		
		this.estadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoActivoFijo(true);
			
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
			
			this.estadoactivofijoConstantesFunciones=new EstadoActivoFijoConstantesFunciones(); 
			this.estadoactivofijoBean=new EstadoActivoFijo();//this.estadoactivofijoConstantesFunciones); 			
			this.estadoactivofijoReturnGeneral=new EstadoActivoFijoParameterReturnGeneral(); 
		
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoactivofijo=new EstadoActivoFijo();
			this.estadoactivofijos = new ArrayList<EstadoActivoFijo>();
			this.estadoactivofijosAux = new ArrayList<EstadoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic=new EstadoActivoFijoLogic();
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoActivoFijo);
				this.jInternalFrameDetalleFormEstadoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormEstadoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoActivoFijo);
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoActivoFijo);
					this.jInternalFrameImportacionEstadoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionEstadoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoActivoFijo);
					this.jInternalFrameOrderByEstadoActivoFijo.setVisible(false);
					this.jInternalFrameOrderByEstadoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoactivofijoReturnGeneral=new EstadoActivoFijoParameterReturnGeneral();
			
			this.estadoactivofijoParameterGeneral=new EstadoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParteActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoactivofijoSessionBean.getEsGuardarRelacionado(),this.estadoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoactivofijoSessionBean.getEsGuardarRelacionado(),this.estadoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarEstadoActivoFijo=true;
			this.isVisibilidadCeldaCopiarEstadoActivoFijo=true;
			this.isVisibilidadCeldaVerFormEstadoActivoFijo=true;
			this.isVisibilidadCeldaOrdenEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoActivoFijo(false);
			
			this.setPermisosUsuarioEstadoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoactivofijoSessionBean.getEsGuardarRelacionado() && this.estadoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoActivoFijoClasesRelacionadas();
			}
			
			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaEstadoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoActivoFijo,this.isPermisoPaginacionMedioEstadoActivoFijo,this.isPermisoPaginacionTodoEstadoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoActivoFijoConstantesFunciones.getTiposSeleccionarEstadoActivoFijo());
				
				this.tiposColumnasSelect=EstadoActivoFijoConstantesFunciones.getTiposSeleccionarEstadoActivoFijo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoActivoFijo();				
				//this.tiposRelacionesSelect=EstadoActivoFijoConstantesFunciones.getTiposRelacionesEstadoActivoFijo(true);
				
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
			//if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoActivoFijo() ;
			
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
			
			
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.parteactivofijoLogic=new ParteActivoFijoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadoactivofijoImplementable= (EstadoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoactivofijoImplementableHome= (EstadoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoactivofijos= new ArrayList<EstadoActivoFijo>();
			this.estadoactivofijosEliminados= new ArrayList<EstadoActivoFijo>();
						
			this.isEsNuevoEstadoActivoFijo=false;
			this.esParaAccionDesdeFormularioEstadoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoActivoFijo();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoActivoFijo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoActivoFijo();

						this.cargarParteTabPanelRelacionadaDetalleActivoFijo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parte Activo Fijos")) {
					if(!ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoActivoFijo();

						this.cargarParteTabPanelRelacionadaParteActivoFijo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoActivoFijo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoActivoFijo.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesEstadoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesEstadoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoActivoFijo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParteActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoActivoFijo.cargarSessionConBeanSwingJInternalFrameParteActivoFijo(false,true,iIndex);
		this.jButtonParteActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParteActivoFijo();

		//this.jTabbedPaneRelacionesEstadoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesEstadoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoActivoFijo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosEstadoActivoFijo.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParteActivoFijo")) {
				int row=this.jTableDatosEstadoActivoFijo.getSelectedRow();
				jButtonParteActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarDetalleActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(estadoactivofijoConstantesFunciones.resaltarDetalleActivoFijoEstadoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoactivofijoConstantesFunciones.resaltarDetalleActivoFijoEstadoActivoFijo);
						}

						jmenuItem.setEnabled(this.estadoactivofijoConstantesFunciones.activarDetalleActivoFijoEstadoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormEstadoActivoFijo.jmenuDetalleEstadoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parte Activo Fijo")) {

					if(this.isTienePermisosParteActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarParteActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parte Activo Fijos"+"("+ParteActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parte Activo Fijos");

						if(estadoactivofijoConstantesFunciones.resaltarParteActivoFijoEstadoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoactivofijoConstantesFunciones.resaltarParteActivoFijoEstadoActivoFijo);
						}

						jmenuItem.setEnabled(this.estadoactivofijoConstantesFunciones.activarParteActivoFijoEstadoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParteActivoFijo"));

						

						this.jInternalFrameDetalleFormEstadoActivoFijo.jmenuDetalleEstadoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoActivoFijo();
		
		this.cargarCombosFrameForeignKeyEstadoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoActivoFijo();
		}
	}
	
	
	
	public void jButtonNuevoEstadoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			
			if(jTableDatosEstadoActivoFijo.getRowCount()>=1) {
				jTableDatosEstadoActivoFijo.removeRowSelectionInterval(0, jTableDatosEstadoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoActivoFijo(true);			
			//this.estadoactivofijo=new EstadoActivoFijo();
			//this.estadoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo() ;
			
			if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);				
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoActivoFijo.getSelectedRows().length;			
			}
			
			estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoActivoFijo--;			
				//EstadoActivoFijo estadoactivofijoAux= new EstadoActivoFijo();			
				//estadoactivofijoAux.setId(this.iIdNuevoEstadoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoActivoFijo estadoactivofijoOrigen=new EstadoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoActivoFijo estadoactivofijoOrigen : estadoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoactivofijoOrigen =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoactivofijoOrigen =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoActivoFijo(estadoactivofijoOrigen,this.estadoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoactivofijoLogic.getEstadoActivoFijos().add(this.estadoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoactivofijos.add(this.estadoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
				
				this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoEstadoActivoFijo(), this.getIndiceNuevoEstadoActivoFijo());
				
				int iLastRow =  this.jTableDatosEstadoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();									
		
			EstadoActivoFijo estadoactivofijoOrigen=new EstadoActivoFijo();
			EstadoActivoFijo estadoactivofijoDestino=new EstadoActivoFijo();
				
			estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoOrigen =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoactivofijoOrigen =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoactivofijoDestino =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoactivofijoDestino =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoactivofijoOrigen =estadoactivofijosSeleccionados.get(0);
				estadoactivofijoDestino =estadoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoActivoFijo(estadoactivofijoOrigen,estadoactivofijoDestino,true,false);
				
				estadoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoactivofijoDestino,estadoactivofijoLogic.getEstadoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoactivofijoDestino,estadoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
				
				//this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoEstadoActivoFijo(), this.getIndiceNuevoEstadoActivoFijo());
				
				int iLastRow =  this.jTableDatosEstadoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionEstadoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesEstadoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoActivoFijo();
			
			this.abrirFrameOrderByEstadoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoActivoFijo.setSize(this.jInternalFrameDetalleFormEstadoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormEstadoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth(),EstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth(),EstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth(),EstadoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}

					if(ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParteActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderByEstadoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoActivoFijo);
				this.jInternalFrameOrderByEstadoActivoFijo.setVisible(false);
				this.jInternalFrameOrderByEstadoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderByEstadoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoActivoFijo==null) {
				
				this.jInternalFrameImportacionEstadoActivoFijo=new ImportacionJInternalFrame(EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoActivoFijo);
				this.jInternalFrameImportacionEstadoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionEstadoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoActivoFijo"));
				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoActivoFijo"));
				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoEstadoActivoFijo=new ReporteDinamicoJInternalFrame(EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoActivoFijo);
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParteActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.jScrollPanelDatosParteActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoActivoFijo.jContentPaneDetalleEstadoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.jScrollPanelDatosParteActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.jScrollPanelDatosParteActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.jScrollPanelDatosParteActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoActivoFijo);
			
	       	this.jInternalFrameDetalleFormEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormEstadoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderByEstadoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderByEstadoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionEstadoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoActivoFijo(true);
			//this.isEsNuevoEstadoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoActivoFijo(false) ;
			
			if(estadoactivofijoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.getEsGuardarRelacionado() && ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParteActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoActivoFijo(true);
			//this.isEsNuevoEstadoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoActivoFijo(false) ;
			
			if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoActivoFijo(false);
			
			//if(!this.isEsNuevoEstadoActivoFijo) {								
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.estadoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoActivoFijo=true;
					this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
					this.isEsNuevoEstadoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesEstadoActivoFijo(false);
			
												
				
				if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoActivoFijoActionPerformed(evt,estadoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoActivoFijo(this.estadoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.estadoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.estadoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoActivoFijoModel) this.jTableDatosEstadoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoActivoFijo=true;
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
				this.isEsNuevoEstadoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesEstadoActivoFijo(false);
				
				
				
				if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoActivoFijo.getRowCount()>=1) {
				jTableDatosEstadoActivoFijo.removeRowSelectionInterval(0, jTableDatosEstadoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(false) ;
			
			this.isEsNuevoEstadoActivoFijo=false;
			
			if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoActivoFijo(false);
				
				//SI ES MANUAL
				if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoActivoFijo--;			
			//EstadoActivoFijo estadoactivofijoAux= new EstadoActivoFijo();			
			//estadoactivofijoAux.setId(this.iIdNuevoEstadoActivoFijo);
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
			
			this.estadoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoactivofijoLogic.getEstadoActivoFijos().add(this.estadoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoactivofijos.add(this.estadoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			
			this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoEstadoActivoFijo(), this.getIndiceNuevoEstadoActivoFijo());
			
			int iLastRow =  this.jTableDatosEstadoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoActivoFijo();
			}
			
			//this.abrirFrameTreeEstadoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Activo FijoS ?", "MANTENIMIENTO DE Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoactivofijoReturnGeneral=estadoactivofijoLogic.procesarImportacionEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoActivoFijo.setFileImportacion(this.jInternalFrameImportacionEstadoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		

		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadoActivoFijo estadoactivofijo:estadoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoActivoFijo estadoactivofijo:estadoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoactivofijo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoActivoFijo estadoactivofijo:estadoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoactivofijo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoActivoFijo(estadoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoActivoFijo(false);
			
			//SI ES MANUAL
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionNuevoEstadoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionSinCerrarEstadoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionSinMensajeEstadoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionNuevoEstadoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionSinCerrarEstadoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoActivoFijo.jCheckBoxPostAccionSinMensajeEstadoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoActivoFijo() throws Exception {
		try	{
			if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoActivoFijo(Boolean esInicializar) throws Exception {				
		if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoactivofijoLogic.getEstadoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoActivoFijo.setModel(new EstadoActivoFijoModel(this.estadoactivofijoLogic.getEstadoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoActivoFijo.setModel(new EstadoActivoFijoModel(this.estadoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoActivoFijo!=null && this.jInternalFrameOrderByEstadoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,estadoactivofijoConstantesFunciones.resaltarSeleccionarEstadoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO,estadoactivofijoConstantesFunciones.resaltarSeleccionarEstadoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,EstadoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.estadoactivofijoConstantesFunciones.mostraridEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoactivofijoConstantesFunciones.resaltaridEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activaridEstadoActivoFijo,this,true,"idEstadoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoactivofijoConstantesFunciones.resaltaridEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activaridEstadoActivoFijo,this,true,"idEstadoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.estadoactivofijoConstantesFunciones.mostrarid_empresaEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.estadoactivofijoConstantesFunciones.resaltarid_empresaEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarid_empresaEstadoActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.estadoactivofijoConstantesFunciones.resaltarid_empresaEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarid_empresaEstadoActivoFijo,false,"id_empresaEstadoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,EstadoActivoFijoConstantesFunciones.LABEL_CODIGO));

		if(this.estadoactivofijoConstantesFunciones.mostrarcodigoEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoActivoFijoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoactivofijoConstantesFunciones.resaltarcodigoEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activarcodigoEstadoActivoFijo,this,true,"codigoEstadoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoactivofijoConstantesFunciones.resaltarcodigoEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activarcodigoEstadoActivoFijo,this,true,"codigoEstadoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoactivofijoConstantesFunciones.mostrarnombreEstadoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoactivofijoConstantesFunciones.resaltarnombreEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activarnombreEstadoActivoFijo,this,true,"nombreEstadoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoactivofijoConstantesFunciones.resaltarnombreEstadoActivoFijo,this.estadoactivofijoConstantesFunciones.activarnombreEstadoActivoFijo,this,true,"nombreEstadoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarDetalleActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(estadoactivofijoConstantesFunciones.resaltarDetalleActivoFijoEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarDetalleActivoFijoEstadoActivoFijo));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(estadoactivofijoConstantesFunciones.resaltarDetalleActivoFijoEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarDetalleActivoFijoEstadoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
			}

			if(this.isTienePermisosParteActivoFijo && this.estadoactivofijoConstantesFunciones.mostrarParteActivoFijoEstadoActivoFijo && !EstadoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parte Activo Fijos");
				tableColumn.setHeaderValue("Parte Activo Fijos");
				tableColumn.setCellRenderer(new ParteActivoFijoTableCell(estadoactivofijoConstantesFunciones.resaltarParteActivoFijoEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarParteActivoFijoEstadoActivoFijo));
				tableColumn.setCellEditor(new ParteActivoFijoTableCell(estadoactivofijoConstantesFunciones.resaltarParteActivoFijoEstadoActivoFijo,this,this.estadoactivofijoConstantesFunciones.activarParteActivoFijoEstadoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoActivoFijo.moveColumn(this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoActivoFijo.moveColumn(this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoActivoFijo.moveColumn(this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoActivoFijo.moveColumn(this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoactivofijoLogic.getEstadoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoactivofijos.size()-1;
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
		//this.jTableDatosEstadoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoActivoFijo();
			
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
				
				//this.isEsNuevoEstadoActivoFijo=false;
					
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
				if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoactivofijo.getsType().equals("DUPLICADO")
				   || this.estadoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoActivoFijo=true;
				
				} else {
					this.isEsNuevoEstadoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoactivofijo.getId()>=0 && !this.estadoactivofijo.getIsNew()) {						
						this.isEsNuevoEstadoActivoFijo=false;
						
					} else {
						this.isEsNuevoEstadoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoActivoFijo(esRelaciones);						
				
				this.seleccionarEstadoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoactivofijo.getId()<0) {
					this.isEsNuevoEstadoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoActivoFijo(evt,rowIndex);
				}	
				
				if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoActivoFijo: " + this.dDif); 
					}
				}								
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoactivofijo)) {
					if(this.estadoactivofijo.getId()>0) {
						this.estadoactivofijo.setIsDeleted(true);
						
						this.estadoactivofijosEliminados.add(this.estadoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoactivofijoLogic.getEstadoActivoFijos().remove(this.estadoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoactivofijos.remove(this.estadoactivofijo);				
					}
					
					
					((EstadoActivoFijoModel) this.jTableDatosEstadoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.estadoactivofijoConstantesFunciones.cargarid_empresaEstadoActivoFijo || this.estadoactivofijoConstantesFunciones.event_dependid_empresaEstadoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.estadoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingEstadoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(estadoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(estadoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.estadoactivofijo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoActivoFijo(EstadoActivoFijo estadoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoActivoFijo(estadoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoActivoFijo(estadoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoActivoFijo(estadoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoActivoFijo(estadoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoActivoFijo(EstadoActivoFijo estadoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setText(estadoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setText(estadoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setText(estadoactivofijo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoActivoFijo estadoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoActivoFijo estadoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoactivofijoLocal=this.estadoactivofijo;
			} else {
				estadoactivofijoLocal=this.estadoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoActivoFijo(estadoactivofijoLocal,true);
					
					if(estadoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoActivoFijo(estadoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(estadoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoActivoFijo(estadoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.getText()==null || this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setText("0");
			}

			if(conColumnasBase) {estadoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelIdEstadoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoactivofijo.setcodigo(this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoActivoFijoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelcodigoEstadoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoactivofijo.setnombre(this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelnombreEstadoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoActivoFijo(EstadoActivoFijo estadoactivofijoBean,EstadoActivoFijo estadoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoActivoFijo(EstadoActivoFijo estadoactivofijoOrigen,EstadoActivoFijo estadoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoactivofijoOrigen.getId()!=null && !estadoactivofijoOrigen.getId().equals(0L))) {estadoactivofijo.setId(estadoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && estadoactivofijoOrigen.getcodigo()!=null && !estadoactivofijoOrigen.getcodigo().equals(""))) {estadoactivofijo.setcodigo(estadoactivofijoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoactivofijoOrigen.getnombre()!=null && !estadoactivofijoOrigen.getnombre().equals(""))) {estadoactivofijo.setnombre(estadoactivofijoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoActivoFijo(EstadoActivoFijo estadoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setText(estadoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setText(estadoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setText(estadoactivofijo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoActivoFijo(EstadoActivoFijoBean estadoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setText(estadoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setText(estadoactivofijoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setText(estadoactivofijoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoActivoFijo(EstadoActivoFijoParameterReturnGeneral estadoactivofijoReturnGeneral,EstadoActivoFijoBean estadoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoActivoFijo estadoactivofijoLocal=new EstadoActivoFijo();
			
			estadoactivofijoLocal=estadoactivofijoReturnGeneral.getEstadoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoactivofijoLocal.getId()!=null && !estadoactivofijoLocal.getId().equals(0L))) {estadoactivofijoBean.setId(estadoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && estadoactivofijoLocal.getcodigo()!=null && !estadoactivofijoLocal.getcodigo().equals(""))) {estadoactivofijoBean.setcodigo(estadoactivofijoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoactivofijoLocal.getnombre()!=null && !estadoactivofijoLocal.getnombre().equals(""))) {estadoactivofijoBean.setnombre(estadoactivofijoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoActivoFijoGenerico(Long idEstadoActivoFijoSeleccionado,JComboBox jComboBoxEstadoActivoFijo,List<EstadoActivoFijo> estadoactivofijosLocal)throws Exception {
		try {
			EstadoActivoFijo  estadoactivofijoTemp=null;

			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosLocal) {
				if(estadoactivofijoAux.getId()!=null && estadoactivofijoAux.getId().equals(idEstadoActivoFijoSeleccionado)) {
					estadoactivofijoTemp=estadoactivofijoAux;
					break;
				}
			}

			jComboBoxEstadoActivoFijo.setSelectedItem(estadoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoActivoFijoGenerico(JComboBox jComboBoxEstadoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleActivoFijo")) {
			jButtonDetalleActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParteActivoFijo")) {
			jButtonParteActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoactivofijo=(EstadoActivoFijo) estadoactivofijoLogic.getEstadoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoactivofijo =(EstadoActivoFijo) estadoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadoactivofijo.getIsNew() && !estadoactivofijo.getIsChanged() && !estadoactivofijo.getIsDeleted()) {
				sDescripcion=estadoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadoactivofijo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoActivoFijo estadoactivofijoRow=new EstadoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoactivofijoRow=(EstadoActivoFijo) estadoactivofijoLogic.getEstadoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoactivofijoRow=(EstadoActivoFijo) estadoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoActivoFijo estadoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo = (EstadoActivoFijo)this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoactivofijo = (EstadoActivoFijo)this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoactivofijo!=null) {
						this.estadoactivofijo = estadoactivofijo;
					} else {
						this.estadoactivofijo = new EstadoActivoFijo();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.estadoactivofijo)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<EstadoActivoFijo> estadoactivofijos=new ArrayList<EstadoActivoFijo>();
					estadoactivofijos.add(this.estadoactivofijo);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoActivoFijo.cargarDetalleActivoFijoBeanSwingJInternalFrame(estadoactivofijos,this.estadoactivofijo,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoActivoFijo=(TitledBorder)this.jScrollPanelDatosEstadoActivoFijo.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderEstadoActivoFijo.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParteActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoActivoFijo estadoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo = (EstadoActivoFijo)this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoactivofijo = (EstadoActivoFijo)this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoactivofijo!=null) {
						this.estadoactivofijo = estadoactivofijo;
					} else {
						this.estadoactivofijo = new EstadoActivoFijo();
					}
				}

				if(this.isTienePermisosParteActivoFijo && this.permiteMantenimiento(this.estadoactivofijo)) {
					ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup=new ParteActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parteactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup;
					} else {
						parteactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame;
					}

					List<EstadoActivoFijo> estadoactivofijos=new ArrayList<EstadoActivoFijo>();
					estadoactivofijos.add(this.estadoactivofijo);
					if(!esRelacionado) {
						//parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setConGuardarRelaciones(false);
						//parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parteactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoActivoFijo.cargarParteActivoFijoBeanSwingJInternalFrame(estadoactivofijos,this.estadoactivofijo,parteactivofijoBeanSwingJInternalFrame,/*conInicializar,*/parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.getConGuardarRelaciones(),parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.getEsGuardarRelacionado());
					parteactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parteactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsParteActivoFijo("no_relacionado");

						parteactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParteActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (ParteActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						parteactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoActivoFijo=(TitledBorder)this.jScrollPanelDatosEstadoActivoFijo.getBorder();
						TitledBorder titledBorderParteActivoFijo=(TitledBorder)parteactivofijoBeanSwingJInternalFrame.jScrollPanelDatosParteActivoFijo.getBorder();

						titledBorderParteActivoFijo.setTitle(titledBorderEstadoActivoFijo.getTitle() + " -> Parte Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parteactivofijoBeanSwingJInternalFrame);
						}

						parteactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parteactivofijoBeanSwingJInternalFrame);

						parteactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parte Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));			
			this.jButtonDuplicarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarEstadoActivoFijo && this.isPermisoDuplicarEstadoActivoFijo));			
			this.jButtonCopiarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarEstadoActivoFijo && this.isPermisoCopiarEstadoActivoFijo));
			this.jButtonVerFormEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormEstadoActivoFijo && this.isPermisoVerFormEstadoActivoFijo));
			
			this.jButtonAbrirOrderByEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));			
			
			this.jButtonNuevoRelacionesEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));			
			this.jButtonNuevoGuardarCambiosEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarEstadoActivoFijo && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarEstadoActivoFijo && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarEstadoActivoFijo && this.isPermisoEliminarEstadoActivoFijo));
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarEstadoActivoFijo);							
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));						
			this.jButtonDuplicarToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarEstadoActivoFijo && this.isPermisoDuplicarEstadoActivoFijo));						
			this.jButtonCopiarToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarEstadoActivoFijo && this.isPermisoCopiarEstadoActivoFijo));			
			this.jButtonVerFormToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormEstadoActivoFijo && this.isPermisoVerFormEstadoActivoFijo));			
			this.jButtonAbrirOrderByToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));
			this.jButtonNuevoRelacionesToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarEstadoActivoFijo && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarEstadoActivoFijo  && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarEstadoActivoFijo && this.isPermisoEliminarEstadoActivoFijo));
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarToolBarEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarEstadoActivoFijo);				
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));			
			this.jMenuItemDuplicarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarEstadoActivoFijo && this.isPermisoDuplicarEstadoActivoFijo));			
			this.jMenuItemCopiarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarEstadoActivoFijo && this.isPermisoCopiarEstadoActivoFijo));			
			this.jMenuItemVerFormEstadoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormEstadoActivoFijo && this.isPermisoVerFormEstadoActivoFijo));			
			this.jMenuItemAbrirOrderByEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));			
			//this.jMenuItemMostrarOcultarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));
			this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenEstadoActivoFijo && this.isPermisoOrdenEstadoActivoFijo));			
			this.jMenuItemNuevoRelacionesEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoEstadoActivoFijo && this.isPermisoNuevoEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemModificarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaModificarEstadoActivoFijo && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemActualizarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarEstadoActivoFijo && this.isPermisoActualizarEstadoActivoFijo));	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemEliminarEstadoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarEstadoActivoFijo && this.isPermisoEliminarEstadoActivoFijo));
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemCancelarEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarEstadoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=this.jButtonNuevoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoActivoFijo=this.jButtonDuplicarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarEstadoActivoFijo=this.jButtonCopiarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormEstadoActivoFijo=this.jButtonVerFormEstadoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoActivoFijo=this.jButtonAbrirOrderByEstadoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=this.jButtonNuevoRelacionesEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarEstadoActivoFijo=this.jButtonModificarEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=this.jButtonGuardarCambiosTablaEstadoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=this.jButtonNuevoToolBarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=this.jButtonNuevoRelacionesToolBarEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarToolBarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarToolBarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarToolBarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarToolBarEstadoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoActivoFijo=this.jButtonGuardarCambiosToolBarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=this.jMenuItemNuevoEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=this.jMenuItemNuevoRelacionesEstadoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemModificarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemActualizarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemEliminarEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemCancelarEstadoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoActivoFijo=this.jMenuItemGuardarCambiosEstadoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=this.jMenuItemGuardarCambiosTablaEstadoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoActivoFijo(Boolean esInicializar) {
		if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoActivoFijo() {
		this.jButtonNuevoEstadoActivoFijo.setVisible(this.isPermisoNuevoEstadoActivoFijo);			
		this.jButtonDuplicarEstadoActivoFijo.setVisible(this.isPermisoDuplicarEstadoActivoFijo);			
		this.jButtonCopiarEstadoActivoFijo.setVisible(this.isPermisoCopiarEstadoActivoFijo);			
		this.jButtonVerFormEstadoActivoFijo.setVisible(this.isPermisoVerFormEstadoActivoFijo);			
		
		this.jButtonAbrirOrderByEstadoActivoFijo.setVisible(this.isPermisoOrdenEstadoActivoFijo);					
		
		this.jButtonNuevoRelacionesEstadoActivoFijo.setVisible(this.isPermisoNuevoEstadoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarEstadoActivoFijo.setVisible(this.isPermisoActualizarEstadoActivoFijo);	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.setVisible(this.isPermisoActualizarEstadoActivoFijo);	
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.setVisible(this.isPermisoEliminarEstadoActivoFijo);
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarEstadoActivoFijo);						
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.setVisible(this.isPermisoGuardarCambiosEstadoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.setVisible(this.isPermisoActualizarEstadoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoActivoFijo() {
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarEstadoActivoFijo.setVisible(this.isPermisoActualizarEstadoActivoFijo);	
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.setVisible(this.isPermisoActualizarEstadoActivoFijo);	
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.setVisible(this.isPermisoEliminarEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarEstadoActivoFijo);							
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarEstadoActivoFijo && this.isPermisoGuardarCambiosEstadoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoActivoFijo() {
		if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoActivoFijo() {
	}
	
	public void jTableDatosEstadoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.getestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoactivofijo==null) {
						this.estadoactivofijo = new EstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				}

				if(this.estadoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.getestadoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadoactivofijoLogic.getConnexion());

				if(this.estadoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoActivoFijo=(TitledBorder)this.jScrollPanelDatosEstadoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.getestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoactivofijo==null) {
						this.estadoactivofijo = new EstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				}

				if(this.estadoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.getestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoactivofijo==null) {
						this.estadoactivofijo = new EstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				}

				if(this.estadoactivofijo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoactivofijo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.getestadoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoactivofijo==null) {
						this.estadoactivofijo = new EstadoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);
				}

				if(this.estadoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaEstadoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);

			this.getEstadoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingEstadoActivoFijo(false);

			//if(EstadoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoActivoFijo() {
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoActivoFijo.dispose();
			this.jInternalFrameDetalleFormEstadoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoEstadoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionEstadoActivoFijo!=null) {
			this.jInternalFrameImportacionEstadoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoActivoFijo.dispose();
			this.jInternalFrameImportacionEstadoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoActivoFijo();
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoActivoFijo")) {
				jButtonDuplicarEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoActivoFijo")) {
				jButtonCopiarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoActivoFijo")) {
				jButtonVerFormEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoActivoFijo")) {
				jButtonDuplicarEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoActivoFijo")) {
				jButtonDuplicarEstadoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoActivoFijo")) {
				jButtonModificarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoActivoFijo")) {
				jButtonModificarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoActivoFijo")) {
				jButtonModificarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoActivoFijo")) {
				jButtonActualizarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoActivoFijo")) {
				jButtonActualizarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoActivoFijo")) {
				jButtonActualizarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoActivoFijo")) {
				jButtonEliminarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoActivoFijo")) {
				jButtonEliminarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoActivoFijo")) {
				jButtonEliminarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoActivoFijo")) {
				jButtonCancelarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoActivoFijo")) {
				jButtonCancelarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoActivoFijo")) {
				jButtonCancelarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoActivoFijo")) {
				jButtonCerrarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoActivoFijo")) {
				jButtonCerrarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoActivoFijo")) {
				jButtonCerrarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoActivoFijo")) {
				jButtonMostrarOcultarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoActivoFijo")) {
				jButtonCancelarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoActivoFijo")) {
				jButtonCopiarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoActivoFijo")) {
				jButtonVerFormEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoActivoFijo")) {
				jButtonCopiarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoActivoFijo")) {
				jButtonVerFormEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoActivoFijo")) {
				jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoActivoFijo")) {
				jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoActivoFijo")) {
				jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoActivoFijo")) {
				jButtonAnterioresEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoActivoFijo")) {
				jButtonAnterioresEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoActivoFijo")) {
				jButtonAnterioresEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoActivoFijo")) {
				jButtonSiguientesEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoActivoFijo")) {
				jButtonSiguientesEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoActivoFijo")) {
				jButtonSiguientesEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoActivoFijo")) {
				jButtonAbrirOrderByEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoActivoFijo")) {
				jButtonMostrarOcultarEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoActivoFijo")) {
				jButtonCerrarReporteDinamicoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoActivoFijo")) {
				jButtonGenerarReporteDinamicoEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoActivoFijo")) {
				jButtonCerrarImportacionEstadoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoActivoFijo")) {
				
				jButtonGenerarImportacionEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoActivoFijo")) {
				
				jButtonAbrirImportacionEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoActivoFijo")) {
				jComboBoxTiposAccionesEstadoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoActivoFijo")) {
				jComboBoxTiposRelacionesEstadoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoActivoFijo")) {
				jComboBoxTiposAccionesEstadoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoActivoFijo")) {
				
				jComboBoxTiposSeleccionarEstadoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoActivoFijo")) {
				jTextFieldValorCampoGeneralEstadoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoActivoFijo")) {
				jButtonAbrirOrderByEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoActivoFijo")) {
				jButtonAbrirOrderByEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoActivoFijo")) {
				jButtonCerrarOrderByEstadoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoActivoFijoBusqueda")) {
				this.jButtonidEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoActivoFijoUpdate")) {
				this.jButtonid_empresaEstadoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoActivoFijoBusqueda")) {
				this.jButtonid_empresaEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoActivoFijoBusqueda")) {
				this.jButtoncodigoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoActivoFijoBusqueda")) {
				this.jButtonnombreEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoActivoFijo estadoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoactivofijoLocal=this.estadoactivofijo;
			} else {
				estadoactivofijoLocal=this.estadoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
							
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
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
			
			


			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
								
						
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
								
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
							
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
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
			
			


			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
								
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoActivoFijo")) {
					jCheckBoxSeleccionarTodosEstadoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoActivoFijo")) {
					jCheckBoxSeleccionadosEstadoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoActivoFijo")) {
					
				}
				
				


				
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
												
				
				


				
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
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
			
			


			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoactivofijo);
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
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
				
				


				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoactivofijoAnterior =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoactivofijo =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoActivoFijo")) {
				
				}
				
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoActivoFijo")) {
			
			}
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoActivoFijo();
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoActivoFijo")) {
				jButtonDuplicarEstadoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoActivoFijo")) {
				jButtonCopiarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoActivoFijo")) {
				jButtonVerFormEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoActivoFijo")) {
				jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoActivoFijo")) {
				jButtonModificarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoActivoFijo")) {
				jButtonActualizarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoActivoFijo")) {
				jButtonEliminarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoActivoFijo")) {
				jButtonCancelarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoActivoFijo")) {
				jButtonCerrarEstadoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoActivoFijo")) {
				jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoActivoFijo")) {
				jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoActivoFijo")) {
				jButtonAbrirOrderByEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoActivoFijo")) {
				jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoActivoFijo")) {
				jButtonAnterioresEstadoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoActivoFijo")) {
				jButtonSiguientesEstadoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoActivoFijoBusqueda")) {
				this.jButtonidEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadoActivoFijoUpdate")) {
				this.jButtonid_empresaEstadoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadoActivoFijoBusqueda")) {
				this.jButtonid_empresaEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoActivoFijoBusqueda")) {
				this.jButtoncodigoEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoActivoFijoBusqueda")) {
				this.jButtonnombreEstadoActivoFijoBusquedaActionPerformed(evt);
			}
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoActivoFijo")) {
				closingInternalFrameEstadoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarEstadoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(EstadoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoActivoFijoActionPerformed(null);
			}
			
			EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoactivofijo,new Object(),this.estadoactivofijoParameterGeneral,this.estadoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoactivofijo)) {
			if(!esControlTabla) {
				if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);			
				}
				
				if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoActivoFijo(this.estadoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoactivofijoReturnGeneral=estadoactivofijoLogic.procesarEventosEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoactivofijoLogic.getEstadoActivoFijos(),this.estadoactivofijo,this.estadoactivofijoParameterGeneral,this.isEsNuevoEstadoActivoFijo,classes);//this.estadoactivofijoLogic.getEstadoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoActivoFijo(this.estadoactivofijoReturnGeneral,this.estadoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoActivoFijo(classes,this.estadoactivofijoReturnGeneral,this.estadoactivofijoBean,false);
					}
						
					if(this.estadoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo());	
					}
						
					if(this.estadoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo(),classes);//this.estadoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoActivoFijo(this.estadoactivofijo,classes);//this.estadoactivofijoBean);									
				}
			
				if(EstadoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoActivoFijo(this.estadoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoActivoFijo(this.estadoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoactivofijoAnterior!=null) {
						this.estadoactivofijo=this.estadoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoactivofijoReturnGeneral=estadoactivofijoLogic.procesarEventosEstadoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoactivofijoLogic.getEstadoActivoFijos(),this.estadoactivofijo,this.estadoactivofijoParameterGeneral,this.isEsNuevoEstadoActivoFijo,classes);//this.estadoactivofijoLogic.getEstadoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo(),estadoactivofijoLogic.getEstadoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo(),this.estadoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoActivoFijo() throws Exception {
		
		EstadoActivoFijoModel estadoactivofijoModel=(EstadoActivoFijoModel)this.jTableDatosEstadoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoactivofijoModel.estadoactivofijos=this.estadoactivofijoLogic.getEstadoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoactivofijoModel.estadoactivofijos=this.estadoactivofijos;
		}
		
		
		((EstadoActivoFijoModel) this.jTableDatosEstadoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoactivofijoAnterior(),this.estadoactivofijoLogic.getEstadoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoactivofijoAnterior(),this.estadoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(estadoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParteActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoLogic.setParteActivoFijos(estadoactivofijo.getParteActivoFijos());
					this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParteActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoactivofijo,new Object(),generalEntityParameterGeneral,this.estadoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoActivoFijoConstantesFunciones.getClassesRelationshipsOfEstadoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoactivofijo,new Object(),generalEntityParameterGeneral,this.estadoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoActivoFijo(EstadoActivoFijoBean estadoactivofijoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(estadoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParteActivoFijo.class)) {
					this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoLogic.setParteActivoFijos(estadoactivofijo.getParteActivoFijos());
					this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParteActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoActivoFijo(ArrayList<Classe> classes,EstadoActivoFijoReturnGeneral estadoactivofijoReturnGeneral,EstadoActivoFijoBean estadoactivofijoBean,Boolean conDefault) throws Exception {
		
			this.estadoactivofijoBean.setDetalleActivoFijos(estadoactivofijoReturnGeneral.getEstadoActivoFijo().getDetalleActivoFijos());
			this.estadoactivofijoBean.setParteActivoFijos(estadoactivofijoReturnGeneral.getEstadoActivoFijo().getParteActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					estadoactivofijo.setDetalleActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParteActivoFijo.class)) {
					estadoactivofijo.setParteActivoFijos(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoBeanSwingJInternalFrame.parteactivofijoLogic.getParteActivoFijos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoActivoFijo = new EstadoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.estadoactivofijoSessionBean.getConGuardarRelaciones(),this.estadoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormEstadoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.estadoactivofijoLogic=this.estadoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoActivoFijo"));
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarEstadoActivoFijo"));

		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoActivoFijo"));
					
		this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemModificarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoActivoFijo"));
						
		this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemActualizarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoActivoFijo"));
								
		this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemEliminarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarEstadoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoActivoFijo"));
					
		this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemCancelarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemDetalleCerrarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonidEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtoncodigoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonnombreEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoActivoFijo"));
		}
		
		this.jTableDatosEstadoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoActivoFijo"));
		
		this.jTableDatosEstadoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoActivoFijo"));
		
		this.jButtonNuevoEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoEstadoActivoFijo"));
		
		this.jButtonDuplicarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarEstadoActivoFijo"));
		
		this.jButtonCopiarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarEstadoActivoFijo"));
		
		this.jButtonVerFormEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormEstadoActivoFijo"));
		
		
		this.jButtonNuevoToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoActivoFijo"));
			
		this.jButtonDuplicarToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoActivoFijo"));
			
		this.jMenuItemNuevoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoActivoFijo"));
			
		this.jMenuItemDuplicarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonModificarToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoActivoFijo"));
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemModificarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonActualizarToolBarEstadoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoActivoFijo"));
				
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemActualizarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonEliminarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoActivoFijo"));
						
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemEliminarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonCancelarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoActivoFijo"));
			
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemCancelarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoActivoFijo"));		
		
		
		this.jButtonCerrarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarEstadoActivoFijo"));
		
		
		this.jButtonCerrarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoActivoFijo"));
			
		this.jMenuItemCerrarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jMenuItemDetalleCerrarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoActivoFijo"));
			
		this.jButtonVerFormToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoActivoFijo"));
		
		this.jMenuItemGuardarCambiosEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoActivoFijo"));
			
		this.jMenuItemCopiarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoActivoFijo"));		
		
		this.jMenuItemVerFormEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoActivoFijo"));
		
		this.jMenuItemRecargarInformacionEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoActivoFijo"));		
		
		
		
		this.jButtonAnterioresEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresEstadoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoActivoFijo"));
		
		this.jMenuItemAnterioresEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoActivoFijo"));		
		
		
		this.jButtonSiguientesEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesEstadoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoActivoFijo"));
			
		this.jMenuItemSiguientesEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoActivoFijo"));
			
		this.jMenuItemAbrirOrderByEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoActivoFijo"));
			
		this.jMenuItemMostrarOcultarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoActivoFijo"));

		this.jCheckBoxSeleccionadosEstadoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoActivoFijo"));
			
		this.jComboBoxTiposAccionesEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonidEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtoncodigoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonnombreEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoActivoFijo"));
				this.jInternalFrameReporteDinamicoEstadoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoActivoFijo!=null) {
				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoActivoFijo"));
				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoActivoFijo"));
				this.jInternalFrameImportacionEstadoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarEstadoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoActivoFijo"));			
			
			if(this.jInternalFrameOrderByEstadoActivoFijo!=null) {
				this.jInternalFrameOrderByEstadoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoActivoFijo.jTabbedPaneRelacionesEstadoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoActivoFijo"));
		
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
            		closingInternalFrameEstadoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            EstadoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(EstadoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoActivoFijo";
		inputMap = this.jButtonNuevoEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoActivoFijo";
		inputMap = this.jButtonModificarEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoActivoFijo";
		inputMap = this.jButtonActualizarEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoActivoFijo";
		inputMap = this.jButtonEliminarEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoActivoFijo";
		inputMap = this.jButtonCancelarEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoActivoFijo";
		inputMap = this.jButtonCerrarEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonGuardarCambiosEstadoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonidEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonid_empresaEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtoncodigoEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoActivoFijo.jButtonnombreEstadoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoActivoFijoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
					estadoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijos) {
					estadoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
						estadoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijos) {
						estadoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoActivoFijo.getSelectedRows();
			
			EstadoActivoFijo estadoactivofijoLocal=new EstadoActivoFijo();
			
			//this.seleccionarTodosEstadoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoactivofijoLocal =(EstadoActivoFijo) this.estadoactivofijoLogic.getEstadoActivoFijos().toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoactivofijoLocal =(EstadoActivoFijo) this.estadoactivofijos.toArray()[this.jTableDatosEstadoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
						estadoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijos) {
						estadoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijoLogic.getEstadoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijos) {
					
						if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoActivoFijo(conSplash);
				
					this.generarReporteEstadoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoActivoFijo();
				
				this.exportarEstadoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoActivoFijos();
				//this.importarEstadoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoActivoFijo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoActivoFijo();
			
			if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
			EstadoActivoFijo estadoactivofijo=new EstadoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoActivoFijo.getSelectedItem();
			
			
			
			
			estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoactivofijosSeleccionados.size()==1) {
				for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
					estadoactivofijo=estadoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,estadoactivofijo);
				}
				else if(this.sTipoRelacion.equals("Parte Activo Fijo")) {
					jButtonParteActivoFijoActionPerformed(null,rowIndex,true,false,estadoactivofijo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoActivoFijo();
			
      		//this.finishProcessEstadoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoActivoFijoReturnGeneral() throws Exception {
		if(this.estadoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoActivoFijo(false);
		}
		
		if(this.estadoactivofijoReturnGeneral.getConRetornoLista() || this.estadoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoactivofijoLogic.setEstadoActivoFijos(this.estadoactivofijoReturnGeneral.getEstadoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoactivofijoLogic.setEstadoActivoFijo(this.estadoactivofijoReturnGeneral.getEstadoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<EstadoActivoFijo> getEstadoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijoLogic.getEstadoActivoFijos()) {
					if(estadoactivofijoAux.getIsSelected()) {
						estadoactivofijosSeleccionados.add(estadoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoActivoFijo estadoactivofijoAux:this.estadoactivofijos) {
					if(estadoactivofijoAux.getIsSelected()) {
						estadoactivofijosSeleccionados.add(estadoactivofijoAux);				
					}
				}
			}
			
			if(estadoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoactivofijosSeleccionados.addAll(this.estadoactivofijoLogic.getEstadoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoactivofijosSeleccionados.addAll(this.estadoactivofijos);				
					}
				}
			}
		} else {
			estadoactivofijosSeleccionados.add(this.estadoactivofijo);
		}
		
		return estadoactivofijosSeleccionados;
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
	
	public void generarReporteEstadoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoActivoFijosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoActivoFijosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoActivoFijo();
		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoActivoFijo();
		
		
		//this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados ,estadoactivofijoImplementable,estadoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionEstadoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoActivoFijo();
		
		this.abrirFrameImportacionEstadoActivoFijo();		
		
			
		//this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados ,estadoactivofijoImplementable,estadoactivofijoImplementableHome);
	}
	
	public void importarEstadoActivoFijos() throws Exception {		
	
	}
	
	public void exportarEstadoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoActivoFijo(estadoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoactivofijoAux.setsDetalleGeneralEntityReporte(estadoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoActivoFijoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoactivofijo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoactivofijo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoActivoFijo(row);				
				iRow++;
			}				
			
			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoActivoFijo(estadoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoActivoFijosSeleccionados() throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();		
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoactivofijo");
			//elementRoot.appendChild(element);
		
			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
				element = document.createElement("estadoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoActivoFijo(estadoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoactivofijo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoactivofijo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoActivoFijo(EstadoActivoFijo estadoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(EstadoActivoFijoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoactivofijo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados=new ArrayList<EstadoActivoFijo>();
		
		estadoactivofijosSeleccionados=this.getEstadoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoActivoFijo(estadoactivofijosSeleccionados);
		
		this.generarReporteEstadoActivoFijos("Todos",estadoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoActivoFijo(ArrayList<EstadoActivoFijo> estadoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoActivoFijo estadoactivofijoAux:estadoactivofijosSeleccionados) {
				estadoactivofijoAux.setsDetalleGeneralEntityReporte(estadoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadoactivofijoAux.setsDescripcionGeneralEntityReporte1(estadoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoactivofijoAux.setsDescripcionGeneralEntityReporte1(estadoactivofijoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoactivofijoAux.setsDescripcionGeneralEntityReporte1(estadoactivofijoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=true;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=true;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=true;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
			this.isVisibilidadCeldaModificarEstadoActivoFijo=true;
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
			this.isVisibilidadCeldaCancelarEstadoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsEstadoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormEstadoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarEstadoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!estadoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;												
			}
			
			this.jButtonCerrarEstadoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoactivofijo)) {
			this.isVisibilidadCeldaActualizarEstadoActivoFijo=false;
			this.isVisibilidadCeldaEliminarEstadoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoActivoFijo() {
		this.isVisibilidadCeldaNuevoEstadoActivoFijo=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoActivoFijo=false;
	}
	
	public void actualizarEstadoPanelsEstadoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionEstadoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoActivoFijo!=null) {
				this.jScrollPanelDatosEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoActivoFijo!=null) {
				this.jPanelPaginacionEstadoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
					this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoActivoFijo!=null) {
				this.jTabbedPaneBusquedasEstadoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoActivoFijo!=null) {
				this.jPanelParametrosReportesEstadoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionEstadoActivoFijoParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.estadoactivofijoSessionBean==null) {
				this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setsPathNavegacionActual(estadoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(EstadoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoActivoFijo(true);
			this.jInternalFrameDetalleFormEstadoActivoFijo.detalleactivofijoSessionBean.setlidEstadoActivoFijoActual(this.idEstadoActivoFijoActual);

			estadoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoActivoFijo(true);
			estadoactivofijoSessionBean.setlIdEstadoActivoFijoActualForeignKey(this.idEstadoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoActivoFijoParaParteActivoFijos() throws Exception {
		Boolean isPaginaPopupParteActivoFijo=false;

		try {

			if(this.estadoactivofijoSessionBean==null) {
				this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setsPathNavegacionActual(estadoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParteActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParteActivoFijo=this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParteActivoFijo(true);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParteActivoFijo(EstadoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoActivoFijo(true);
			this.jInternalFrameDetalleFormEstadoActivoFijo.parteactivofijoSessionBean.setlidEstadoActivoFijoActual(this.idEstadoActivoFijoActual);

			estadoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoActivoFijo(true);
			estadoactivofijoSessionBean.setlIdEstadoActivoFijoActualForeignKey(this.idEstadoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoActivoFijoSessionBean estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		
		if(this.estadoactivofijoSessionBean==null) {
			this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		}
		
		this.estadoactivofijoSessionBean.setsUltimaBusquedaEstadoActivoFijo(this.getsAccionBusqueda());
		this.estadoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			estadoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoActivoFijoSessionBean estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		
		if(this.estadoactivofijoSessionBean==null) {
			this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		}
		
		if(this.estadoactivofijoSessionBean.getsUltimaBusquedaEstadoActivoFijo()!=null&&!this.estadoactivofijoSessionBean.getsUltimaBusquedaEstadoActivoFijo().equals("")) {
			this.setsAccionBusqueda(estadoactivofijoSessionBean.getsUltimaBusquedaEstadoActivoFijo());
			this.setiNumeroPaginacion(estadoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(estadoactivofijoSessionBean.getid_empresa());
				estadoactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.estadoactivofijoSessionBean.setsUltimaBusquedaEstadoActivoFijo("");
		this.estadoactivofijoSessionBean.setiNumeroPaginacion(EstadoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.estadoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioEstadoActivoFijo();
		this.updateVisibilidadBusquedasFormularioEstadoActivoFijo();
		this.updateHabilitarBusquedasFormularioEstadoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoActivoFijo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarEstadoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioEstadoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioEstadoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoactivofijoConstantesFunciones.resaltaridEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setBorder(this.estadoactivofijoConstantesFunciones.resaltaridEstadoActivoFijo);}
		if(this.estadoactivofijoConstantesFunciones.resaltarid_empresaEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setBorder(this.estadoactivofijoConstantesFunciones.resaltarid_empresaEstadoActivoFijo);}
		if(this.estadoactivofijoConstantesFunciones.resaltarcodigoEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setBorder(this.estadoactivofijoConstantesFunciones.resaltarcodigoEstadoActivoFijo);}
		if(this.estadoactivofijoConstantesFunciones.resaltarnombreEstadoActivoFijo!=null && this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setBorder(this.estadoactivofijoConstantesFunciones.resaltarnombreEstadoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostraridEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelidEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostraridEstadoActivoFijo);
		//this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarid_empresaEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelid_empresaEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarid_empresaEstadoActivoFijo);
		//this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarcodigoEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelcodigoEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarcodigoEstadoActivoFijo);
		//this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarnombreEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jPanelnombreEstadoActivoFijo.setVisible(this.estadoactivofijoConstantesFunciones.mostrarnombreEstadoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormEstadoActivoFijo.jLabelidEstadoActivoFijo.setEnabled(this.estadoactivofijoConstantesFunciones.activaridEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jComboBoxid_empresaEstadoActivoFijo.setEnabled(this.estadoactivofijoConstantesFunciones.activarid_empresaEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jTextFieldcodigoEstadoActivoFijo.setEnabled(this.estadoactivofijoConstantesFunciones.activarcodigoEstadoActivoFijo);
		this.jInternalFrameDetalleFormEstadoActivoFijo.jTextAreanombreEstadoActivoFijo.setEnabled(this.estadoactivofijoConstantesFunciones.activarnombreEstadoActivoFijo);
		}
	}
	
		
}