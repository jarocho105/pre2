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

import com.bydan.erp.inventario.util.UbicacionBodeConstantesFunciones;
import com.bydan.erp.inventario.util.UbicacionBodeParameterReturnGeneral;
//import com.bydan.erp.inventario.util.UbicacionBodeParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.UbicacionBodeBean;
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
public class UbicacionBodeBeanSwingJInternalFrame extends UbicacionBodeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UbicacionBodeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UbicacionBode> ubicacionbodeValidator = new ClassValidator<UbicacionBode>(UbicacionBode.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UbicacionBode ubicacionbode;	
	public UbicacionBode ubicacionbodeAux;
	public UbicacionBode ubicacionbodeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UbicacionBode ubicacionbodeTotales;
	public Long idUbicacionBodeActual;
	public Long iIdNuevoUbicacionBode=0L;
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

	public String sFinalQueryComboUbicacionBode="";

	public List<UbicacionBode> ubicacionbodesForeignKey;

	public List<UbicacionBode> getubicacionbodesForeignKey() {
		return ubicacionbodesForeignKey;
	}

	public void setubicacionbodesForeignKey(List<UbicacionBode> ubicacionbodesForeignKey) {
		this.ubicacionbodesForeignKey = ubicacionbodesForeignKey;
	}

	//OBJETO FK ACTUAL
	public UbicacionBode ubicacionbodeForeignKey;

	public UbicacionBode getubicacionbodeForeignKey() {
		return ubicacionbodeForeignKey;
	}

	public void setubicacionbodeForeignKey(UbicacionBode ubicacionbodeForeignKey) {
		this.ubicacionbodeForeignKey = ubicacionbodeForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosUbicacionBode=false;

	public Boolean getIsTienePermisosUbicacionBode() {
		return isTienePermisosUbicacionBode;
	}

	public void setIsTienePermisosUbicacionBode(Boolean isTienePermisosUbicacionBode) {
		this.isTienePermisosUbicacionBode= isTienePermisosUbicacionBode;
	}


	public Boolean isTienePermisosUbicacionProdu=false;

	public Boolean getIsTienePermisosUbicacionProdu() {
		return isTienePermisosUbicacionProdu;
	}

	public void setIsTienePermisosUbicacionProdu(Boolean isTienePermisosUbicacionProdu) {
		this.isTienePermisosUbicacionProdu= isTienePermisosUbicacionProdu;
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
	
	public Boolean isPermisoTodoUbicacionBode;
	public Boolean isPermisoNuevoUbicacionBode;
	public Boolean isPermisoActualizarUbicacionBode;
	public Boolean isPermisoActualizarOriginalUbicacionBode;
	public Boolean isPermisoEliminarUbicacionBode;
	public Boolean isPermisoGuardarCambiosUbicacionBode;
	public Boolean isPermisoConsultaUbicacionBode;
	public Boolean isPermisoBusquedaUbicacionBode;
	public Boolean isPermisoReporteUbicacionBode;
	public Boolean isPermisoPaginacionMedioUbicacionBode;
	public Boolean isPermisoPaginacionAltoUbicacionBode;
	public Boolean isPermisoPaginacionTodoUbicacionBode;
	public Boolean isPermisoCopiarUbicacionBode;
	public Boolean isPermisoVerFormUbicacionBode;
	public Boolean isPermisoDuplicarUbicacionBode;
	public Boolean isPermisoOrdenUbicacionBode;
	
	public List<UbicacionBode> ubicacionbodesArbol;
	
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
	
	public UbicacionBodeParameterReturnGeneral ubicacionbodeReturnGeneral;
	public UbicacionBodeParameterReturnGeneral ubicacionbodeParameterGeneral;
	
	

	public UbicacionProduLogic ubicacionproduLogic=null;

	public UbicacionProduLogic getUbicacionProduLogic() {
		return ubicacionproduLogic;
	}

	public void setUbicacionProduLogic(UbicacionProduLogic ubicacionproduLogic) {
		this.ubicacionproduLogic = ubicacionproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUbicacionBode=false;
	public Boolean esParaAccionDesdeFormularioUbicacionBode=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UbicacionBodeSessionBeanAdditional ubicacionbodeSessionBeanAdditional=null;
	
	public UbicacionBodeSessionBeanAdditional getUbicacionBodeSessionBeanAdditional() {
		return this.ubicacionbodeSessionBeanAdditional;
	}
	
	public void setUbicacionBodeSessionBeanAdditional(UbicacionBodeSessionBeanAdditional ubicacionbodeSessionBeanAdditional) {
		try {
			this.ubicacionbodeSessionBeanAdditional=ubicacionbodeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UbicacionBodeBeanSwingJInternalFrameAdditional ubicacionbodeBeanSwingJInternalFrameAdditional=null;
	//public class UbicacionBodeBeanSwingJInternalFrame
	
	public UbicacionBodeBeanSwingJInternalFrameAdditional getUbicacionBodeBeanSwingJInternalFrameAdditional() {
		return this.ubicacionbodeBeanSwingJInternalFrameAdditional;
	}
	
	public void setUbicacionBodeBeanSwingJInternalFrameAdditional(UbicacionBodeBeanSwingJInternalFrameAdditional ubicacionbodeBeanSwingJInternalFrameAdditional) {
		try {
			this.ubicacionbodeBeanSwingJInternalFrameAdditional=ubicacionbodeBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UbicacionBodeLogic ubicacionbodeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UbicacionBode ubicacionbodeBean;
	public UbicacionBodeConstantesFunciones ubicacionbodeConstantesFunciones;
	//public UbicacionBodeParameterReturnGeneral ubicacionbodeReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	
	//PARAMETROS
	
	
	//public List<UbicacionBode> ubicacionbodes;	
	//public List<UbicacionBode> ubicacionbodesEliminados;
	//public List<UbicacionBode> ubicacionbodesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUbicacionBode=false;
	public Boolean isVisibilidadCeldaDuplicarUbicacionBode=true;
	public Boolean isVisibilidadCeldaCopiarUbicacionBode=true;
	public Boolean isVisibilidadCeldaVerFormUbicacionBode=true;
	public Boolean isVisibilidadCeldaOrdenUbicacionBode=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
	public Boolean isVisibilidadCeldaModificarUbicacionBode=false;
	public Boolean isVisibilidadCeldaActualizarUbicacionBode=false;
	public Boolean isVisibilidadCeldaEliminarUbicacionBode=false;
	public Boolean isVisibilidadCeldaCancelarUbicacionBode=false;
	public Boolean isVisibilidadCeldaGuardarUbicacionBode=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUbicacionBode=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUbicacionBode=false;
	
	public Long getiIdNuevoUbicacionBode() {
		return this.iIdNuevoUbicacionBode;
	}

	public void setiIdNuevoUbicacionBode(Long iIdNuevoUbicacionBode) {
		this.iIdNuevoUbicacionBode = iIdNuevoUbicacionBode;
	}
	
	public Long getidUbicacionBodeActual() {
		return this.idUbicacionBodeActual;
	}

	public void setidUbicacionBodeActual(Long idUbicacionBodeActual) {
		this.idUbicacionBodeActual = idUbicacionBodeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UbicacionBode getubicacionbode() {
		return this.ubicacionbode;
	}

	public void setubicacionbode(UbicacionBode ubicacionbode) {
		this.ubicacionbode = ubicacionbode;
	}
	
	public UbicacionBode getubicacionbodeAux() {
		return this.ubicacionbodeAux;
	}

	public void setubicacionbodeAux(UbicacionBode ubicacionbodeAux) {
		this.ubicacionbodeAux = ubicacionbodeAux;
	}				
	
	public UbicacionBode getubicacionbodeAnterior() {
		return this.ubicacionbodeAnterior;
	}

	public void setubicacionbodeAnterior(UbicacionBode ubicacionbodeAnterior) {
		this.ubicacionbodeAnterior = ubicacionbodeAnterior;
	}	
	
	public UbicacionBode getubicacionbodeTotales() {
		return this.ubicacionbodeTotales;
	}

	public void setubicacionbodeTotales(UbicacionBode ubicacionbodeTotales) {
		this.ubicacionbodeTotales = ubicacionbodeTotales;
	}	
	
	public UbicacionBode getubicacionbodeBean() {
		return this.ubicacionbodeBean;
	}

	public void setubicacionbodeBean(UbicacionBode ubicacionbodeBean) {
		this.ubicacionbodeBean = ubicacionbodeBean;
	}	
	
	public UbicacionBodeParameterReturnGeneral getubicacionbodeReturnGeneral() {
		return this.ubicacionbodeReturnGeneral;
	}

	public void setubicacionbodeReturnGeneral(UbicacionBodeParameterReturnGeneral ubicacionbodeReturnGeneral) {
		this.ubicacionbodeReturnGeneral = ubicacionbodeReturnGeneral;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_ubicacion_bodeFK_IdUbicacionBode=null;

	public Long getid_ubicacion_bodeFK_IdUbicacionBode() {
		return this.id_ubicacion_bodeFK_IdUbicacionBode;
	}

	public void setid_ubicacion_bodeFK_IdUbicacionBode(Long id_ubicacion_bodeFK_IdUbicacionBode) {
		this.id_ubicacion_bodeFK_IdUbicacionBode = id_ubicacion_bodeFK_IdUbicacionBode;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UbicacionBodeLogic getUbicacionBodeLogic()	{		
		return ubicacionbodeLogic;
	}

	public void setUbicacionBodeLogic(UbicacionBodeLogic ubicacionbodeLogic) {
		this.ubicacionbodeLogic = ubicacionbodeLogic;
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
	
	public Boolean getIsEsNuevoUbicacionBode() {
		return isEsNuevoUbicacionBode;
	}

	public void setIsEsNuevoUbicacionBode(Boolean isEsNuevoUbicacionBode) {
		this.isEsNuevoUbicacionBode = isEsNuevoUbicacionBode;
	}

	public Boolean getEsParaAccionDesdeFormularioUbicacionBode() {
		return esParaAccionDesdeFormularioUbicacionBode;
	}
	
	public void setEsParaAccionDesdeFormularioUbicacionBode(Boolean esParaAccionDesdeFormularioUbicacionBode) {
		this.esParaAccionDesdeFormularioUbicacionBode = esParaAccionDesdeFormularioUbicacionBode;
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

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ubicacionbodeSessionBean.getlidEmpresaActual());
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

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(ubicacionbodeSessionBean.getlidSucursalActual());
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

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(ubicacionbodeSessionBean.getlidBodegaActual());
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

	public void cargarCombosUbicacionBodesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UbicacionBodeLogic ubicacionbodeLogic=new UbicacionBodeLogic();

			//ubicacionbodeLogic.getUbicacionBodeDataAccess().setIsForForeingKeyData(true);

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ubicacionbodeLogic.getUbicacionBodeDataAccess().setIsForForeingKeyData(true);

					ubicacionbodeLogic.getTodosUbicacionBodesWithConnection(sFinalQuery,new Pagination());

					this.ubicacionbodesForeignKey=ubicacionbodeLogic.getUbicacionBodes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUbicacionBode(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getEntityWithConnection(ubicacionbodeSessionBean.getlidUbicacionBodeActual());
					this.ubicacionbodesForeignKey.add(ubicacionbodeLogic.getUbicacionBode());
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

					if(this.ubicacionbode!=null) {
						this.ubicacionbode.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUbicacionBode.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUbicacionBodeGenerico)throws Exception
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
				jComboBoxid_empresaUbicacionBodeGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUbicacionBodeGenerico!=null && jComboBoxid_empresaUbicacionBodeGenerico.getItemCount()>0) {
					jComboBoxid_empresaUbicacionBodeGenerico.setSelectedIndex(0);
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

					if(this.ubicacionbode!=null) {
						this.ubicacionbode.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalUbicacionBode.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalUbicacionBodeGenerico)throws Exception
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
				jComboBoxid_sucursalUbicacionBodeGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalUbicacionBodeGenerico!=null && jComboBoxid_sucursalUbicacionBodeGenerico.getItemCount()>0) {
					jComboBoxid_sucursalUbicacionBodeGenerico.setSelectedIndex(0);
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

					if(this.ubicacionbode!=null) {
						this.ubicacionbode.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaUbicacionBode.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaUbicacionBode!=null) {
						jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaUbicacionBode!=null) {
							//jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaUbicacionBode.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaUbicacionBodeGenerico)throws Exception
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
				jComboBoxid_bodegaUbicacionBodeGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaUbicacionBodeGenerico!=null && jComboBoxid_bodegaUbicacionBodeGenerico.getItemCount()>0) {
					jComboBoxid_bodegaUbicacionBodeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUbicacionBodeForeignKey(Long idUbicacionBodeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ubicacionbodeTemp!=null) {

					if(this.ubicacionbode!=null) {
						this.ubicacionbode.setUbicacionBode(ubicacionbodeTemp);
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedItem(ubicacionbodeTemp);
					}
				} else {
					//jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedItem(ubicacionbodeTemp);
					if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
						if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.getItemCount()>0) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUbicacionBode") || sFormularioTipoBusqueda.equals("Todos")){
					if(ubicacionbodeTemp!=null && jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode!=null) {
						jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setSelectedItem(ubicacionbodeTemp);
					} else {
						if(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode!=null) {
							//jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setSelectedItem(ubicacionbodeTemp);
							if(jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.getItemCount()>0) {
								jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setSelectedIndex(0);
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

	public String getActualUbicacionBodeForeignKeyDescripcion(Long idUbicacionBodeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}


			sDescripcion=UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbodeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUbicacionBodeForeignKeyGenerico(Long idUbicacionBodeSeleccionado,JComboBox jComboBoxid_ubicacion_bodeUbicacionBodeGenerico)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesForeignKey) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}

			if(ubicacionbodeTemp!=null) {
				jComboBoxid_ubicacion_bodeUbicacionBodeGenerico.setSelectedItem(ubicacionbodeTemp);
			} else {
				if(jComboBoxid_ubicacion_bodeUbicacionBodeGenerico!=null && jComboBoxid_ubicacion_bodeUbicacionBodeGenerico.getItemCount()>0) {
					jComboBoxid_ubicacion_bodeUbicacionBodeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UbicacionBode ubicacionbode,JComboBox jComboBoxid_empresaUbicacionBodeGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUbicacionBodeGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUbicacionBodeGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ubicacionbode.setid_empresa(empresaAux.getId());
				ubicacionbode.setempresa_descripcion(UbicacionBodeConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ubicacionbode.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(UbicacionBode ubicacionbode,JComboBox jComboBoxid_sucursalUbicacionBodeGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalUbicacionBodeGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalUbicacionBodeGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ubicacionbode.setid_sucursal(sucursalAux.getId());
				ubicacionbode.setsucursal_descripcion(UbicacionBodeConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ubicacionbode.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(UbicacionBode ubicacionbode,JComboBox jComboBoxid_bodegaUbicacionBodeGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaUbicacionBodeGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaUbicacionBodeGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				ubicacionbode.setid_bodega(bodegaAux.getId());
				ubicacionbode.setbodega_descripcion(UbicacionBodeConstantesFunciones.getBodegaDescripcion(bodegaAux));
				ubicacionbode.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUbicacionBodeForeignKey(UbicacionBode ubicacionbode,JComboBox jComboBoxid_ubicacion_bodeUbicacionBodeGenerico)throws Exception
	{
		try
		{
			UbicacionBode  ubicacionbodeAux=new UbicacionBode();

			if(jComboBoxid_ubicacion_bodeUbicacionBodeGenerico==null) {
				ubicacionbodeAux=(UbicacionBode)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.getSelectedItem();
			} else {
				ubicacionbodeAux=(UbicacionBode)jComboBoxid_ubicacion_bodeUbicacionBodeGenerico.getSelectedItem();
			}

			if(ubicacionbodeAux!=null) {
				ubicacionbode.setid_ubicacion_bode(ubicacionbodeAux.getId());
				ubicacionbode.setubicacionbode_descripcion(UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbodeAux));
				ubicacionbode.setUbicacionBode(ubicacionbodeAux);			}
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

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
					}

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
					}

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
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

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
					}

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.addItem(bodega);
							}
						}

						if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUbicacionBodesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUbicacionBode=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.removeAllItems();

							for(UbicacionBode ubicacionbode:this.ubicacionbodesForeignKey) {
								this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.addItem(ubicacionbode);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUbicacionBode!=null) { 
					}

					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUbicacionBode") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.removeAllItems();

							for(UbicacionBode ubicacionbode:this.ubicacionbodesForeignKey) {
								this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.addItem(ubicacionbode);
							}
						}

						if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUbicacionBodeForeignKey(UbicacionBode ubicacionbode,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedItem(ubicacionbode);
						}
					} else {
						if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setSelectedItem(ubicacionbode);
						} else {
							this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUbicacionBode() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UbicacionBodeConstantesFunciones.refrescarForeignKeysDescripcionesUbicacionBode(this.ubicacionbodeLogic.getUbicacionBodes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UbicacionBodeConstantesFunciones.refrescarForeignKeysDescripcionesUbicacionBode(this.ubicacionbodes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(UbicacionBode.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ubicacionbodeLogic.setUbicacionBodes(this.ubicacionbodes);
			ubicacionbodeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UbicacionBodeParameterReturnGeneral getUbicacionBodeParameterGeneral() {
		return this.ubicacionbodeParameterGeneral;
	}
	
	public void setUbicacionBodeParameterGeneral(UbicacionBodeParameterReturnGeneral ubicacionbodeParameterGeneral) {
		this.ubicacionbodeParameterGeneral = ubicacionbodeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUbicacionBode() {
		return isPermisoTodoUbicacionBode;
	}

	public void setIsPermisoTodoUbicacionBode(Boolean isPermisoTodoUbicacionBode) {
		this.isPermisoTodoUbicacionBode = isPermisoTodoUbicacionBode;
	}

	public Boolean getIsPermisoNuevoUbicacionBode() {
		return isPermisoNuevoUbicacionBode;
	}

	public void setIsPermisoNuevoUbicacionBode(Boolean isPermisoNuevoUbicacionBode) {
		this.isPermisoNuevoUbicacionBode = isPermisoNuevoUbicacionBode;
	}

	public Boolean getIsPermisoActualizarUbicacionBode() {
		return isPermisoActualizarUbicacionBode;
	}

	public void setIsPermisoActualizarUbicacionBode(Boolean isPermisoActualizarUbicacionBode) {
		this.isPermisoActualizarUbicacionBode = isPermisoActualizarUbicacionBode;
	}

	public Boolean getIsPermisoEliminarUbicacionBode() {
		return isPermisoEliminarUbicacionBode;
	}

	public void setIsPermisoEliminarUbicacionBode(Boolean isPermisoEliminarUbicacionBode) {
		this.isPermisoEliminarUbicacionBode = isPermisoEliminarUbicacionBode;
	}

	public Boolean getIsPermisoGuardarCambiosUbicacionBode() {
		return isPermisoGuardarCambiosUbicacionBode;
	}

	public void setIsPermisoGuardarCambiosUbicacionBode(Boolean isPermisoGuardarCambiosUbicacionBode) {
		this.isPermisoGuardarCambiosUbicacionBode = isPermisoGuardarCambiosUbicacionBode;
	}
	
	public Boolean getIsPermisoConsultaUbicacionBode() {
		return isPermisoConsultaUbicacionBode;
	}

	public void setIsPermisoConsultaUbicacionBode(Boolean isPermisoConsultaUbicacionBode) {
		this.isPermisoConsultaUbicacionBode = isPermisoConsultaUbicacionBode;
	}

	public Boolean getIsPermisoBusquedaUbicacionBode() {
		return isPermisoBusquedaUbicacionBode;
	}

	public void setIsPermisoBusquedaUbicacionBode(Boolean isPermisoBusquedaUbicacionBode) {
		this.isPermisoBusquedaUbicacionBode = isPermisoBusquedaUbicacionBode;
	}

	public Boolean getIsPermisoReporteUbicacionBode() {
		return isPermisoReporteUbicacionBode;
	}

	public void setIsPermisoReporteUbicacionBode(Boolean isPermisoReporteUbicacionBode) {
		this.isPermisoReporteUbicacionBode = isPermisoReporteUbicacionBode;
	}
	
	public Boolean getIsPermisoPaginacionMedioUbicacionBode() {
		return isPermisoPaginacionMedioUbicacionBode;
	}

	public void setIsPermisoPaginacionMedioUbicacionBode(Boolean isPermisoPaginacionMedioUbicacionBode) {
		this.isPermisoPaginacionMedioUbicacionBode = isPermisoPaginacionMedioUbicacionBode;
	}
	
	public Boolean getIsPermisoPaginacionTodoUbicacionBode() {
		return isPermisoPaginacionTodoUbicacionBode;
	}

	public void setIsPermisoPaginacionTodoUbicacionBode(Boolean isPermisoPaginacionTodoUbicacionBode) {
		this.isPermisoPaginacionTodoUbicacionBode = isPermisoPaginacionTodoUbicacionBode;
	}
	
	public Boolean getIsPermisoPaginacionAltoUbicacionBode() {
		return isPermisoPaginacionAltoUbicacionBode;
	}

	public void setIsPermisoPaginacionAltoUbicacionBode(Boolean isPermisoPaginacionAltoUbicacionBode) {
		this.isPermisoPaginacionAltoUbicacionBode = isPermisoPaginacionAltoUbicacionBode;
	}
	
	public Boolean getIsPermisoCopiarUbicacionBode() {
		return isPermisoCopiarUbicacionBode;
	}

	public void setIsPermisoCopiarUbicacionBode(Boolean isPermisoCopiarUbicacionBode) {
		this.isPermisoCopiarUbicacionBode = isPermisoCopiarUbicacionBode;
	}
	
	public Boolean getIsPermisoVerFormUbicacionBode() {
		return isPermisoVerFormUbicacionBode;
	}

	public void setIsPermisoVerFormUbicacionBode(Boolean isPermisoVerFormUbicacionBode) {
		this.isPermisoVerFormUbicacionBode = isPermisoVerFormUbicacionBode;
	}
	
	public Boolean getIsPermisoDuplicarUbicacionBode() {
		return isPermisoDuplicarUbicacionBode;
	}

	public void setIsPermisoDuplicarUbicacionBode(Boolean isPermisoDuplicarUbicacionBode) {
		this.isPermisoDuplicarUbicacionBode = isPermisoDuplicarUbicacionBode;
	}
	
	public Boolean getIsPermisoOrdenUbicacionBode() {
		return isPermisoOrdenUbicacionBode;
	}

	public void setIsPermisoOrdenUbicacionBode(Boolean isPermisoOrdenUbicacionBode) {
		this.isPermisoOrdenUbicacionBode = isPermisoOrdenUbicacionBode;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUbicacionBode() {
		return isVisibilidadCeldaNuevoUbicacionBode;
	}

	public void setIsVisibilidadCeldaNuevoUbicacionBode(Boolean isVisibilidadCeldaNuevoUbicacionBode) {
		this.isVisibilidadCeldaNuevoUbicacionBode = isVisibilidadCeldaNuevoUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUbicacionBode() {
		return isVisibilidadCeldaDuplicarUbicacionBode;
	}

	public void setIsVisibilidadCeldaDuplicarUbicacionBode(Boolean isVisibilidadCeldaDuplicarUbicacionBode) {
		this.isVisibilidadCeldaDuplicarUbicacionBode = isVisibilidadCeldaDuplicarUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUbicacionBode() {
		return isVisibilidadCeldaCopiarUbicacionBode;
	}

	public void setIsVisibilidadCeldaCopiarUbicacionBode(Boolean isVisibilidadCeldaCopiarUbicacionBode) {
		this.isVisibilidadCeldaCopiarUbicacionBode = isVisibilidadCeldaCopiarUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUbicacionBode() {
		return isVisibilidadCeldaVerFormUbicacionBode;
	}

	public void setIsVisibilidadCeldaVerFormUbicacionBode(Boolean isVisibilidadCeldaVerFormUbicacionBode) {
		this.isVisibilidadCeldaVerFormUbicacionBode = isVisibilidadCeldaVerFormUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUbicacionBode() {
		return isVisibilidadCeldaOrdenUbicacionBode;
	}

	public void setIsVisibilidadCeldaOrdenUbicacionBode(Boolean isVisibilidadCeldaOrdenUbicacionBode) {
		this.isVisibilidadCeldaOrdenUbicacionBode = isVisibilidadCeldaOrdenUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUbicacionBode() {
		return isVisibilidadCeldaNuevoRelacionesUbicacionBode;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUbicacionBode(Boolean isVisibilidadCeldaNuevoRelacionesUbicacionBode) {
		this.isVisibilidadCeldaNuevoRelacionesUbicacionBode = isVisibilidadCeldaNuevoRelacionesUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUbicacionBode() {
		return isVisibilidadCeldaModificarUbicacionBode;
	}

	public void setIsVisibilidadCeldaModificarUbicacionBode(Boolean isVisibilidadCeldaModificarUbicacionBode) {
		this.isVisibilidadCeldaModificarUbicacionBode = isVisibilidadCeldaModificarUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUbicacionBode() {
		return isVisibilidadCeldaActualizarUbicacionBode;
	}

	public void setIsVisibilidadCeldaActualizarUbicacionBode(Boolean isVisibilidadCeldaActualizarUbicacionBode) {
		this.isVisibilidadCeldaActualizarUbicacionBode = isVisibilidadCeldaActualizarUbicacionBode;
	}

	public Boolean getIsVisibilidadCeldaEliminarUbicacionBode() {
		return isVisibilidadCeldaEliminarUbicacionBode;
	}

	public void setIsVisibilidadCeldaEliminarUbicacionBode(Boolean isVisibilidadCeldaEliminarUbicacionBode) {
		this.isVisibilidadCeldaEliminarUbicacionBode = isVisibilidadCeldaEliminarUbicacionBode;
	}

	public Boolean getIsVisibilidadCeldaCancelarUbicacionBode() {
		return isVisibilidadCeldaCancelarUbicacionBode;
	}

	public void setIsVisibilidadCeldaCancelarUbicacionBode(Boolean isVisibilidadCeldaCancelarUbicacionBode) {
		this.isVisibilidadCeldaCancelarUbicacionBode = isVisibilidadCeldaCancelarUbicacionBode;
	}

	public Boolean getIsVisibilidadCeldaGuardarUbicacionBode() {
		return isVisibilidadCeldaGuardarUbicacionBode;
	}

	public void setIsVisibilidadCeldaGuardarUbicacionBode(Boolean isVisibilidadCeldaGuardarUbicacionBode) {
		this.isVisibilidadCeldaGuardarUbicacionBode = isVisibilidadCeldaGuardarUbicacionBode;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUbicacionBode() {
		return isVisibilidadCeldaGuardarCambiosUbicacionBode;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUbicacionBode(Boolean isVisibilidadCeldaGuardarCambiosUbicacionBode) {
		this.isVisibilidadCeldaGuardarCambiosUbicacionBode = isVisibilidadCeldaGuardarCambiosUbicacionBode;
	}
		
	public UbicacionBodeSessionBean getubicacionbodeSessionBean() {
		return this.ubicacionbodeSessionBean;
	}
	
	public void setubicacionbodeSessionBean(UbicacionBodeSessionBean ubicacionbodeSessionBean) {
		this.ubicacionbodeSessionBean=ubicacionbodeSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdUbicacionBode() {
		return this.isVisibilidadFK_IdUbicacionBode;
	}

	public void setisVisibilidadFK_IdUbicacionBode(Boolean isVisibilidadFK_IdUbicacionBode) {
		this.isVisibilidadFK_IdUbicacionBode=isVisibilidadFK_IdUbicacionBode;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(UbicacionBode ubicacionbode)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ubicacionbode,null);
				this.setActualParaGuardarSucursalForeignKey(ubicacionbode,null);
				this.setActualParaGuardarBodegaForeignKey(ubicacionbode,null);
				this.setActualParaGuardarUbicacionBodeForeignKey(ubicacionbode,null);
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
	
	public void bugActualizarReferenciaActual(UbicacionBode ubicacionbode,UbicacionBode ubicacionbodeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUbicacionBode(ubicacionbode);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ubicacionbodeAux.setId(ubicacionbode.getId());
		ubicacionbodeAux.setVersionRow(ubicacionbode.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUbicacionBode();
		
			int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ubicacionbodeValidator.getInvalidValues(this.ubicacionbode);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ubicacionbodeLogic.setDatosCliente(datosCliente);
			ubicacionbodeLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ubicacionbodeAux=new  UbicacionBode();
				
				ubicacionbodeAux.setIsNew(true);
				ubicacionbodeAux.setIsChanged(true);
				
				ubicacionbodeAux.setUbicacionBodeOriginal(this.ubicacionbode);
				
				ubicacionbodeAux.setId(this.ubicacionbode.getId());	
				ubicacionbodeAux.setVersionRow(this.ubicacionbode.getVersionRow());	
				ubicacionbodeAux.setid_empresa(this.ubicacionbode.getid_empresa());	
				ubicacionbodeAux.setid_sucursal(this.ubicacionbode.getid_sucursal());	
				ubicacionbodeAux.setid_bodega(this.ubicacionbode.getid_bodega());	
				ubicacionbodeAux.setid_ubicacion_bode(this.ubicacionbode.getid_ubicacion_bode());	
				ubicacionbodeAux.setnombre(this.ubicacionbode.getnombre());	
				ubicacionbodeAux.setnivel(this.ubicacionbode.getnivel());	
				ubicacionbodeAux.setorden(this.ubicacionbode.getorden());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionbodeAux,ubicacionbodes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.saveUbicacionBodes();//WithConnection
						//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);
					
					this.refrescarForeignKeysDescripcionesUbicacionBode();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionbodeLogic.saveUbicacionBodeRelaciones(ubicacionbodeAux,this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes(),this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());//WithConnection
								//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes= new ArrayList<UbicacionBode>();
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus= new ArrayList<UbicacionProdu>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes());

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ubicacionbodeAux,ubicacionbodes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ubicacionbodeAux=new  UbicacionBode();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado() 
					|| (this.ubicacionbodeSessionBean.getEsGuardarRelacionado() && this.ubicacionbode.getId()>=0)) {
						
					ubicacionbodeAux.setIsNew(false);
				}
				
				ubicacionbodeAux.setIsDeleted(false);
			
				ubicacionbodeAux.setId(this.ubicacionbode.getId());	
				ubicacionbodeAux.setVersionRow(this.ubicacionbode.getVersionRow());	
				ubicacionbodeAux.setid_empresa(this.ubicacionbode.getid_empresa());	
				ubicacionbodeAux.setid_sucursal(this.ubicacionbode.getid_sucursal());	
				ubicacionbodeAux.setid_bodega(this.ubicacionbode.getid_bodega());	
				ubicacionbodeAux.setid_ubicacion_bode(this.ubicacionbode.getid_ubicacion_bode());	
				ubicacionbodeAux.setnombre(this.ubicacionbode.getnombre());	
				ubicacionbodeAux.setnivel(this.ubicacionbode.getnivel());	
				ubicacionbodeAux.setorden(this.ubicacionbode.getorden());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionbodeAux,ubicacionbodes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.saveUbicacionBodes();//WithConnection
						//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);
					
					this.refrescarForeignKeysDescripcionesUbicacionBode();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						}
						//ARCHITECTURE
						
						if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionbodeLogic.saveUbicacionBodeRelaciones(ubicacionbodeAux,this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes(),this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());//WithConnection
								//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes= new ArrayList<UbicacionBode>();
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus= new ArrayList<UbicacionProdu>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes());

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ubicacionbodeAux,ubicacionbodes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ubicacionbode,ubicacionbodeAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ubicacionbodeAux=new  UbicacionBode();
				
				ubicacionbodeAux.setIsNew(false);
				ubicacionbodeAux.setIsChanged(false);
				
				ubicacionbodeAux.setIsDeleted(true);
				
				ubicacionbodeAux.setId(this.ubicacionbode.getId());	
				ubicacionbodeAux.setVersionRow(this.ubicacionbode.getVersionRow());	
				ubicacionbodeAux.setid_empresa(this.ubicacionbode.getid_empresa());	
				ubicacionbodeAux.setid_sucursal(this.ubicacionbode.getid_sucursal());	
				ubicacionbodeAux.setid_bodega(this.ubicacionbode.getid_bodega());	
				ubicacionbodeAux.setid_ubicacion_bode(this.ubicacionbode.getid_ubicacion_bode());	
				ubicacionbodeAux.setnombre(this.ubicacionbode.getnombre());	
				ubicacionbodeAux.setnivel(this.ubicacionbode.getnivel());	
				ubicacionbodeAux.setorden(this.ubicacionbode.getorden());	
				
				if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ubicacionbodeAux.getId()>=0) {	
						this.ubicacionbodesEliminados.add(ubicacionbodeAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionbodeAux,ubicacionbodes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.saveUbicacionBodes();//WithConnection
						//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus().addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodesEliminados);
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus.addAll(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodusEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ubicacionbodeLogic.saveUbicacionBodeRelaciones(ubicacionbodeAux,this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes(),this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());//WithConnection
								//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.setUbicacionProdus(new ArrayList<UbicacionProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes= new ArrayList<UbicacionBode>();
							this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus= new ArrayList<UbicacionProdu>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes());

							if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ubicacionbodeAux.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
								|| this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(ubicacionbodeAux,ubicacionbodeLogic.getUbicacionBodes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(ubicacionbodeAux,ubicacionbodes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getUbicacionBodes().addAll(this.ubicacionbodesEliminados);
					
					ubicacionbodeLogic.saveUbicacionBodes();//WithConnection
					//ubicacionbodeLogic.getSetVersionRowUbicacionBodes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUbicacionBode();
				
				this.ubicacionbodesEliminados= new ArrayList<UbicacionBode>();		
			}
			
			if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosUbicacionBodeArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyUbicacionBodeListas();
			
			this.cargarCombosForeignKeyUbicacionBode(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ubicacion Bode GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ubicacionbode=ubicacionbodeAux;
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
      		//this.finishProcessUbicacionBode();
      	}
		
	}	
	
	public void actualizarRelaciones(UbicacionBode ubicacionbodeLocal) throws Exception {
		
		if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				ubicacionbodeLocal.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes());
				ubicacionbodeLocal.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());
			
			} else {
			
				ubicacionbodeLocal.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodes);
				ubicacionbodeLocal.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UbicacionBode ubicacionbodeLocal) throws Exception {	
		if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ubicacionbodeLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ubicacionbodeLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				ubicacionbodeLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UbicacionBodeDetalleFormJInternalFrame.class)) {
				UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrameLocal=(UbicacionBodeBeanSwingJInternalFrame) ((UbicacionBodeDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ubicacionbodeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUbicacionBode(ubicacionbodeBeanSwingJInternalFrameLocal.getubicacionbode(),true);
				ubicacionbodeBeanSwingJInternalFrameLocal.actualizarLista(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode,this.ubicacionbodesForeignKey);

				ubicacionbodeBeanSwingJInternalFrameLocal.actualizarRelaciones(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode);

				ubicacionbodeLocal.setUbicacionBode(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode);

				this.addItemDefectoCombosForeignKeyUbicacionBode();
				this.cargarCombosFrameUbicacionBodesForeignKey("Formulario");
				this.setActualUbicacionBodeForeignKey(ubicacionbodeBeanSwingJInternalFrameLocal.ubicacionbode.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUbicacionBodeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ubicacionbodeValidator.getInvalidValues(this.ubicacionbode);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UbicacionBode ubicacionbode,List<UbicacionBode> ubicacionbodes) throws Exception {
		try	{		
			UbicacionBodeConstantesFunciones.actualizarLista(ubicacionbode,ubicacionbodes,this.ubicacionbodeSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UbicacionBode ubicacionbode,List<UbicacionBode> ubicacionbodes) throws Exception {
		try	{			
			UbicacionBodeConstantesFunciones.actualizarSelectedLista(ubicacionbode,ubicacionbodes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UbicacionBode> ubicacionbodesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ubicacionbodesLocal=this.ubicacionbodeLogic.getUbicacionBodes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ubicacionbodesLocal=this.ubicacionbodes;
			}
			//ARCHITECTURE
		
			for(UbicacionBode ubicacionbodeLocal:ubicacionbodesLocal) {
				if(this.permiteMantenimiento(ubicacionbodeLocal) && ubicacionbodeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UbicacionBodeConstantesFunciones.getUbicacionBodeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_empresaUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_sucursalUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_bodegaUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.IDUBICACIONBODE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_ubicacion_bodeUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelnombreUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.NIVEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelnivelUbicacionBode,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UbicacionBodeConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelordenUbicacionBode,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_empresaUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_sucursalUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_bodegaUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelid_ubicacion_bodeUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelnombreUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelnivelUbicacionBode,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUbicacionBode.jLabelordenUbicacionBode,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("UbicacionBode")) {
			if(this.ubicacionbode==null) {
				this.ubicacionbode= new UbicacionBode();
			}

			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUbicacionBode
				this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.getubicacionbode().setUbicacionBode(this.ubicacionbode);
			}

			return;
		}
		 else  if(sTipo.equals("UbicacionProdu")) {
			if(this.ubicacionbode==null) {
				this.ubicacionbode= new UbicacionBode();
			}

			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUbicacionBode
				this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.getubicacionprodu().setUbicacionBode(this.ubicacionbode);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoUbicacionBode--;	
		
		
		this.ubicacionbodeAux=new UbicacionBode();
		
		this.ubicacionbodeAux.setId(this.iIdNuevoUbicacionBode);
		this.ubicacionbodeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ubicacionbodeLogic.getUbicacionBodes().add(this.ubicacionbodeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ubicacionbodes.add(this.ubicacionbodeAux);
		}
		//ARCHITECTURE
		
		this.ubicacionbode=this.ubicacionbodeAux;
		
		if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUbicacionBode(this.ubicacionbode);
			this.setVariablesObjetoActualToFormularioForeignKeyUbicacionBode(this.ubicacionbode);
		}
				
		//this.setDefaultControlesUbicacionBode();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUbicacionBode();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUbicacionBode();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionBode();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUbicacionBode(this.ubicacionbodeBean,this.ubicacionbode,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UbicacionBodeConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
			classes=UbicacionBodeConstantesFunciones.getClassesRelationshipsOfUbicacionBode(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ubicacionbodeReturnGeneral=ubicacionbodeLogic.procesarEventosUbicacionBodesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionbodeLogic.getUbicacionBodes(),this.ubicacionbode,this.ubicacionbodeParameterGeneral,this.isEsNuevoUbicacionBode,classes);//this.ubicacionbodeLogic.getUbicacionBode()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUbicacionBode(this.ubicacionbodeReturnGeneral,this.ubicacionbodeBean,false);
		
		if(this.ubicacionbodeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode());
		}
		
		if(this.ubicacionbodeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode(),classes);//this.ubicacionbodeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUbicacionBode();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUbicacionBode();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.RecargarFormUbicacionBode(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUbicacionBode(false);
						
			if(ubicacionbodeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.getEsGuardarRelacionado() && UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUbicacionBodeActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.getEsGuardarRelacionado() && UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUbicacionProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionBode();
			}
			
			this.actualizarVisualTableDatosUbicacionBode();
			
			this.jTableDatosUbicacionBode.setRowSelectionInterval(this.getIndiceNuevoUbicacionBode(), this.getIndiceNuevoUbicacionBode());
			
			this.seleccionarFilaTablaUbicacionBodeActual();
						
			this.actualizarEstadoCeldasBotonesUbicacionBode("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUbicacionBode(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarnombreUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarnivelUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarordenUbicacionBode);	
		//
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarid_empresaUbicacionBode);//
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarid_sucursalUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarid_bodegaUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setEnabled(isHabilitar && this.ubicacionbodeConstantesFunciones.activarid_ubicacion_bodeUbicacionBode);
	};
	
	public void setDefaultControlesUbicacionBode() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUbicacionBode(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ubicacionbodeSessionBean.setConGuardarRelaciones(true);			
			this.ubicacionbodeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.ubicacionbodeSessionBean.setConGuardarRelaciones(false);			
			this.ubicacionbodeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoUbicacionBode() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
				if(ubicacionbodeAux.getId().equals(this.iIdNuevoUbicacionBode)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodes) {
				if(ubicacionbodeAux.getId().equals(this.iIdNuevoUbicacionBode)) {
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
	
	public int getIndiceActualUbicacionBode(UbicacionBode ubicacionbode,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
				if(ubicacionbodeAux.getId().equals(ubicacionbode.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodes) {
				if(ubicacionbodeAux.getId().equals(ubicacionbode.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUbicacionBode(UbicacionBode ubicacionbodeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
				if(ubicacionbodeAux.getUbicacionBodeOriginal().getId().equals(ubicacionbodeOriginal.getId())) {
					existe=true;
					ubicacionbodeOriginal.setId(ubicacionbodeAux.getId());
					ubicacionbodeOriginal.setVersionRow(ubicacionbodeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionBode ubicacionbodeAux:this.ubicacionbodes) {
				if(ubicacionbodeAux.getUbicacionBodeOriginal().getId().equals(ubicacionbodeOriginal.getId())) {
					existe=true;
					ubicacionbodeOriginal.setId(ubicacionbodeAux.getId());
					ubicacionbodeOriginal.setVersionRow(ubicacionbodeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUbicacionBode(Boolean esParaCancelar) throws Exception {
		ubicacionbodesAux=new ArrayList<UbicacionBode>();
		ubicacionbodeAux=new UbicacionBode();
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
					if(ubicacionbodeAux.getId()<0) {
						ubicacionbodesAux.add(ubicacionbodeAux);
					}		
				}
				this.iIdNuevoUbicacionBode=0L;
				this.ubicacionbodeLogic.getUbicacionBodes().removeAll(ubicacionbodesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionBode ubicacionbodeAux:this.ubicacionbodes) {
					if(ubicacionbodeAux.getId()<0) {
						ubicacionbodesAux.add(ubicacionbodeAux);
					}		
				}
				this.iIdNuevoUbicacionBode=0L;
				this.ubicacionbodes.removeAll(ubicacionbodesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUbicacionBode 
					&& this.ubicacionbodeLogic.getUbicacionBodes().size()>0
					) {
					ubicacionbodeAux=this.ubicacionbodeLogic.getUbicacionBodes().get(this.ubicacionbodeLogic.getUbicacionBodes().size() - 1);
				
					if(ubicacionbodeAux.getId()<0) {
						this.ubicacionbodeLogic.getUbicacionBodes().remove(ubicacionbodeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUbicacionBode && this.ubicacionbodes.size()>0) {
					ubicacionbodeAux=this.ubicacionbodes.get(this.ubicacionbodes.size() - 1);
				
					if(ubicacionbodeAux.getId()<0) {
						this.ubicacionbodes.remove(ubicacionbodeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUbicacionBode(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ubicacionbode.getId()<0) {
				this.ubicacionbodeLogic.getUbicacionBodes().remove(this.ubicacionbode);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ubicacionbode.getId()<0) {
				this.ubicacionbodes.remove(this.ubicacionbode);
			}
		}			
	}
	
	public void setEstadosInicialesUbicacionBode(List<UbicacionBode> ubicacionbodesAux) throws Exception {
		UbicacionBodeConstantesFunciones.setEstadosInicialesUbicacionBode(ubicacionbodesAux);
	}
	
	public void setEstadosInicialesUbicacionBode(UbicacionBode ubicacionbodeAux) throws Exception {
		UbicacionBodeConstantesFunciones.setEstadosInicialesUbicacionBode(ubicacionbodeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUbicacionBodeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUbicacionBodeActual()) {
				if(!this.isEsNuevoUbicacionBode) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUbicacionBode=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUbicacionBodeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ubicacion Bode ?", "MANTENIMIENTO DE Ubicacion Bode", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UbicacionBode ubicacionbode) throws Exception {
		UbicacionBodeConstantesFunciones.seleccionarAsignar(this.ubicacionbode,ubicacionbode);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUbicacionBode=this.isPermisoActualizarOriginalUbicacionBode;
			
			
			this.seleccionarAsignar(ubicacionbode);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UbicacionBodeConstantesFunciones.quitarEspaciosUbicacionBode(this.ubicacionbode,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUbicacionBode("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ubicacionbodeSessionBean.setsFuncionBusquedaRapida(this.ubicacionbodeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUbicacionBode) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUbicacionBode(esParaCancelar);				
				this.cancelarNuevoUbicacionBode(esParaCancelar);								
			}
			
			this.ubicacionbode=new UbicacionBode();
			
			this.inicializarUbicacionBode();
			
			this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUbicacionBode() throws Exception {
		try {
			UbicacionBodeConstantesFunciones.inicializarUbicacionBode(this.ubicacionbode);
			
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
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ubicacionbodeLogic.getUbicacionBodes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUbicacionBodes(String sAccionBusqueda,List<UbicacionBode> ubicacionbodesParaReportes) throws Exception {
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
					sPathReporteFinal="UbicacionBode"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UbicacionBodeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UbicacionBodeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UbicacionBode"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ubicacion Bodes");		
		parameters.put("busquedapor", UbicacionBodeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(UbicacionBode.class));
			classes.add(new Classe(UbicacionProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					UbicacionBodeLogic ubicacionbodeLogicAuxiliar=new UbicacionBodeLogic();
					ubicacionbodeLogicAuxiliar.setDatosCliente(ubicacionbodeLogic.getDatosCliente());				
					ubicacionbodeLogicAuxiliar.setUbicacionBodes(ubicacionbodesParaReportes);
					
					ubicacionbodeLogicAuxiliar.cargarRelacionesLoteForeignKeyUbicacionBodeWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					ubicacionbodesParaReportes=ubicacionbodeLogicAuxiliar.getUbicacionBodes();
					
					//ubicacionbodeLogic.getNewConnexionToDeep();
					
					//for (UbicacionBode ubicacionbode:ubicacionbodesParaReportes) {
					//	ubicacionbodeLogic.deepLoad(ubicacionbode, false, DeepLoadType.INCLUDE, classes);
					//}						
					//ubicacionbodeLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//ubicacionbodeLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileUbicacionBode = AuxiliarReportes.class.getResourceAsStream("UbicacionBodeDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ubicacionbode", reportFileUbicacionBode);

			InputStream reportFileUbicacionProdu = AuxiliarReportes.class.getResourceAsStream("UbicacionProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ubicacionprodu", reportFileUbicacionProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUbicacionBode=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UbicacionBodeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UbicacionBodeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUbicacionBode=new JRBeanArrayDataSource(UbicacionBodeJInternalFrame.TraerUbicacionBodeBeans(ubicacionbodesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUbicacionBode);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UbicacionBodeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UbicacionBodeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UbicacionBodeBean.TraerUbicacionBodeBeans(ubicacionbodesParaReportes).toArray()));
							
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
				this.generarExcelReporteUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUbicacionBodeActionPerformed(null);
					//this.generarExcelReporteUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUbicacionBodes(sAccionBusqueda,sTipoArchivoReporte,ubicacionbodesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUbicacionBodes(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionBode> ubicacionbodesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionBodes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUbicacionBode("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UbicacionBode ubicacionbode : ubicacionbodesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UbicacionBodeConstantesFunciones.generarExcelReporteDataUbicacionBode("NORMAL",row,workbook,ubicacionbode,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUbicacionBode(String sTipo,Row row,Workbook workbook) {
		
		UbicacionBodeConstantesFunciones.generarExcelReporteHeaderUbicacionBode(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUbicacionBodes(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionBode> ubicacionbodesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionBodes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UbicacionBode ubicacionbode : ubicacionbodesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbode));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getubicacionbode_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_NIVEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NIVEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getnivel());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UbicacionBodeConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ubicacionbode.getorden());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUbicacionBodes(String sAccionBusqueda,String sTipoArchivoReporte,List<UbicacionBode> ubicacionbodesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UbicacionBode> ubicacionbodesRespaldo=null;
		
		classes=UbicacionBodeConstantesFunciones.getClassesRelationshipsOfUbicacionBode(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ubicacionbodeLogic.setDatosCliente(this.datosCliente);
		this.ubicacionbodeLogic.setDatosDeep(this.datosDeep);
		this.ubicacionbodeLogic.setIsConDeep(true);
		
		ubicacionbodesRespaldo=this.ubicacionbodeLogic.getUbicacionBodes();
		
		this.ubicacionbodeLogic.setUbicacionBodes(ubicacionbodesParaReportes);	
		this.ubicacionbodeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ubicacionbodesParaReportes=this.ubicacionbodeLogic.getUbicacionBodes();
		this.ubicacionbodeLogic.setUbicacionBodes(ubicacionbodesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UbicacionBodes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUbicacionBode("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UbicacionBode ubicacionbode : ubicacionbodesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUbicacionBode("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UbicacionBodeConstantesFunciones.generarExcelReporteDataUbicacionBode("NORMAL",row,workbook,ubicacionbode,cellStyleDataAux);
		
			
			


				//UbicacionBode
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO))) {

				if(ubicacionbode.getUbicacionBodes()!=null && ubicacionbode.getUbicacionBodes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UbicacionBodeConstantesFunciones.generarExcelReporteHeaderUbicacionBode("RELACIONADO",row,workbook);
				}

				if(ubicacionbode.getUbicacionBodes()!=null) {
					i2=0;
					for(UbicacionBode ubicacionbodeAutoRef : ubicacionbode.getUbicacionBodes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UbicacionBodeConstantesFunciones.generarExcelReporteDataUbicacionBode("RELACIONADO",row,workbook,ubicacionbodeAutoRef,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//UbicacionProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(UbicacionProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(ubicacionbode.getUbicacionProdus()!=null && ubicacionbode.getUbicacionProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(UbicacionProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					UbicacionProduConstantesFunciones.generarExcelReporteHeaderUbicacionProdu("RELACIONADO",row,workbook);
				}

				if(ubicacionbode.getUbicacionProdus()!=null) {
					i2=0;
					for(UbicacionProdu ubicacionprodu : ubicacionbode.getUbicacionProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						UbicacionProduConstantesFunciones.generarExcelReporteDataUbicacionProdu("RELACIONADO",row,workbook,ubicacionprodu,cellStyleDataAuxHijo);
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
		cell.setCellValue(UbicacionBodeConstantesFunciones.getUbicacionBodeDescripcion(ubicacionbode));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionBode.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUbicacionBode() throws Exception {		
		this.startProcessUbicacionBode(true);
	}
	
	public void startProcessUbicacionBode(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUbicacionBode ,this.jPanelParametrosReportesUbicacionBode, this.jScrollPanelDatosUbicacionBode,this.jPanelPaginacionUbicacionBode, this.jScrollPanelDatosEdicionUbicacionBode, this.jPanelAccionesUbicacionBode,this.jPanelAccionesFormularioUbicacionBode,this.jmenuBarUbicacionBode,this.jmenuBarDetalleUbicacionBode,this.jTtoolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode);		
		
		final JTabbedPane jTabbedPaneBusquedasUbicacionBode=this.jTabbedPaneBusquedasUbicacionBode; 
		
		final JPanel jPanelParametrosReportesUbicacionBode=this.jPanelParametrosReportesUbicacionBode;
		//final JScrollPane jScrollPanelDatosUbicacionBode=this.jScrollPanelDatosUbicacionBode;
		final JTable jTableDatosUbicacionBode=this.jTableDatosUbicacionBode;		
		final JPanel jPanelPaginacionUbicacionBode=this.jPanelPaginacionUbicacionBode;
		//final JScrollPane jScrollPanelDatosEdicionUbicacionBode=this.jScrollPanelDatosEdicionUbicacionBode;
		final JPanel jPanelAccionesUbicacionBode=this.jPanelAccionesUbicacionBode;
		
		JPanel jPanelCamposAuxiliarUbicacionBode=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUbicacionBode=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			jPanelCamposAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jPanelCamposUbicacionBode;
			jPanelAccionesFormularioAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jPanelAccionesFormularioUbicacionBode;
		}
		
		final JPanel jPanelCamposUbicacionBode=jPanelCamposAuxiliarUbicacionBode;
		final JPanel jPanelAccionesFormularioUbicacionBode=jPanelAccionesFormularioAuxiliarUbicacionBode;
		
		
		final JMenuBar jmenuBarUbicacionBode=this.jmenuBarUbicacionBode;
		final JToolBar jTtoolBarUbicacionBode=this.jTtoolBarUbicacionBode;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUbicacionBode=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUbicacionBode=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			jmenuBarDetalleAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jmenuBarDetalleUbicacionBode;
			jTtoolBarDetalleAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jTtoolBarDetalleUbicacionBode;
		}
		
		final JMenuBar jmenuBarDetalleUbicacionBode=jmenuBarDetalleAuxiliarUbicacionBode;
		final JToolBar jTtoolBarDetalleUbicacionBode=jTtoolBarDetalleAuxiliarUbicacionBode;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUbicacionBode;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUbicacionBode;
			processRunnable.jTableDatos=jTableDatosUbicacionBode;
			processRunnable.jPanelCampos=jPanelCamposUbicacionBode;
			processRunnable.jPanelPaginacion=jPanelPaginacionUbicacionBode;
			processRunnable.jPanelAcciones=jPanelAccionesUbicacionBode;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUbicacionBode;
			
			
			processRunnable.jmenuBar=jmenuBarUbicacionBode;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUbicacionBode;
			processRunnable.jTtoolBar=jTtoolBarUbicacionBode;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUbicacionBode;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUbicacionBode ,jPanelParametrosReportesUbicacionBode,jTableDatosUbicacionBode, /*jScrollPanelDatosUbicacionBode,*/jPanelCamposUbicacionBode,jPanelPaginacionUbicacionBode, /*jScrollPanelDatosEdicionUbicacionBode,*/ jPanelAccionesUbicacionBode,jPanelAccionesFormularioUbicacionBode,jmenuBarUbicacionBode,jmenuBarDetalleUbicacionBode,jTtoolBarUbicacionBode,jTtoolBarDetalleUbicacionBode);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUbicacionBode ,jPanelParametrosReportesUbicacionBode, jScrollPanelDatosUbicacionBode,jPanelPaginacionUbicacionBode, jScrollPanelDatosEdicionUbicacionBode, jPanelAccionesUbicacionBode,jPanelAccionesFormularioUbicacionBode,jmenuBarUbicacionBode,jmenuBarDetalleUbicacionBode,jTtoolBarUbicacionBode,jTtoolBarDetalleUbicacionBode);
						
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
	
	public void finishProcessUbicacionBode() {// throws Exception 
		this.finishProcessUbicacionBode(true);
	}
	
	public void finishProcessUbicacionBode(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUbicacionBode ,this.jPanelParametrosReportesUbicacionBode, this.jScrollPanelDatosUbicacionBode,this.jPanelPaginacionUbicacionBode, this.jScrollPanelDatosEdicionUbicacionBode, this.jPanelAccionesUbicacionBode,this.jPanelAccionesFormularioUbicacionBode,this.jmenuBarUbicacionBode,this.jmenuBarDetalleUbicacionBode,this.jTtoolBarUbicacionBode,this.jTtoolBarDetalleUbicacionBode);		
		
		final JTabbedPane jTabbedPaneBusquedasUbicacionBode=this.jTabbedPaneBusquedasUbicacionBode; 
		
		final JPanel jPanelParametrosReportesUbicacionBode=this.jPanelParametrosReportesUbicacionBode;
		//final JScrollPane jScrollPanelDatosUbicacionBode=this.jScrollPanelDatosUbicacionBode;
		final JTable jTableDatosUbicacionBode=this.jTableDatosUbicacionBode;		
		final JPanel jPanelPaginacionUbicacionBode=this.jPanelPaginacionUbicacionBode;
		//final JScrollPane jScrollPanelDatosEdicionUbicacionBode=this.jScrollPanelDatosEdicionUbicacionBode;
		final JPanel jPanelAccionesUbicacionBode=this.jPanelAccionesUbicacionBode;
		
		JPanel jPanelCamposAuxiliarUbicacionBode=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUbicacionBode=new JPanel();
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			jPanelCamposAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jPanelCamposUbicacionBode;
			jPanelAccionesFormularioAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jPanelAccionesFormularioUbicacionBode;
		}
		
		final JPanel jPanelCamposUbicacionBode=jPanelCamposAuxiliarUbicacionBode;
		final JPanel jPanelAccionesFormularioUbicacionBode=jPanelAccionesFormularioAuxiliarUbicacionBode;
		
		
		final JMenuBar jmenuBarUbicacionBode=this.jmenuBarUbicacionBode;		
		final JToolBar jTtoolBarUbicacionBode=this.jTtoolBarUbicacionBode;
				
		JMenuBar jmenuBarDetalleAuxiliarUbicacionBode=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUbicacionBode=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			jmenuBarDetalleAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jmenuBarDetalleUbicacionBode;
			jTtoolBarDetalleAuxiliarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jTtoolBarDetalleUbicacionBode;		
		}
		
		final JMenuBar jmenuBarDetalleUbicacionBode=jmenuBarDetalleAuxiliarUbicacionBode;
		final JToolBar jTtoolBarDetalleUbicacionBode=jTtoolBarDetalleAuxiliarUbicacionBode;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUbicacionBode;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUbicacionBode;
			processRunnable.jTableDatos=jTableDatosUbicacionBode;
			processRunnable.jPanelCampos=jPanelCamposUbicacionBode;
			processRunnable.jPanelPaginacion=jPanelPaginacionUbicacionBode;
			processRunnable.jPanelAcciones=jPanelAccionesUbicacionBode;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUbicacionBode;
			
			
			processRunnable.jmenuBar=jmenuBarUbicacionBode;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUbicacionBode;
			processRunnable.jTtoolBar=jTtoolBarUbicacionBode;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUbicacionBode;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUbicacionBode ,jPanelParametrosReportesUbicacionBode, jTableDatosUbicacionBode,/*jScrollPanelDatosUbicacionBode,*/jPanelCamposUbicacionBode,jPanelPaginacionUbicacionBode, /*jScrollPanelDatosEdicionUbicacionBode,*/ jPanelAccionesUbicacionBode,jPanelAccionesFormularioUbicacionBode,jmenuBarUbicacionBode,jmenuBarDetalleUbicacionBode,jTtoolBarUbicacionBode,jTtoolBarDetalleUbicacionBode));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUbicacionBode(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUbicacionBode(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUbicacionBode(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUbicacionBode(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUbicacionBode,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUbicacionBode,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUbicacionBode(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUbicacionBode,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUbicacionBode,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosUbicacionBodeArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			ubicacionbodeLogic.getTodosUbicacionBodes(finalQueryGlobal+"",this.pagination);//WithConnection
			this.ubicacionbodesArbol=ubicacionbodeLogic.getUbicacionBodes();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ubicacionbodeConstantesFunciones.getsFinalQueryUbicacionBode();
		String  finalQueryPaginacionTodos=this.ubicacionbodeConstantesFunciones.getsFinalQueryUbicacionBode();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesNoUbicacionBode(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ubicacionbodesEliminados= new ArrayList<UbicacionBode>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUbicacionBode();
		
				///*UbicacionBodeSessionBean*/this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			
			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
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
					this.iNumeroPaginacion=UbicacionBodeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UbicacionBodeConstantesFunciones.getClassesForeignKeysOfUbicacionBode(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ubicacionbode."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ubicacionbodesAux= new ArrayList<UbicacionBode>();
			
				
			ubicacionbodeLogic.setDatosCliente(this.datosCliente);
			ubicacionbodeLogic.setDatosDeep(this.datosDeep);
			ubicacionbodeLogic.setIsConDeep(true);
			
			
			ubicacionbodeLogic.getUbicacionBodeDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ubicacionbodeLogic.getTodosUbicacionBodes(finalQueryGlobal,pagination);
					
					//ubicacionbodeLogic.getTodosUbicacionBodesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ubicacionbodeLogic.getUbicacionBodes()==null|| ubicacionbodeLogic.getUbicacionBodes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionbodesAux= new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodeLogic.getUbicacionBodes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodesAux= new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionbodeLogic.getTodosUbicacionBodes(finalQueryGlobal+"",this.pagination);												
							
							//ubicacionbodeLogic.getTodosUbicacionBodesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUbicacionBodes("Todos",ubicacionbodeLogic.getUbicacionBodes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());					
							ubicacionbodeLogic.getUbicacionBodes().addAll(ubicacionbodesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodes=new ArrayList<UbicacionBode>();
							ubicacionbodes.addAll(ubicacionbodesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUbicacionBode=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUbicacionBode=this.idActual;
				
				} else if(this.idUbicacionBodeActual!=null && this.idUbicacionBodeActual!=0L) {
					idUbicacionBode=idUbicacionBodeActual;
				}
				
					
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndicePorId(idUbicacionBode);
				
				this.ubicacionbodes=new ArrayList<UbicacionBode>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ubicacionbodeLogic.getEntity(idUbicacionBode);
					
					//ubicacionbodeLogic.getEntityWithConnection(idUbicacionBode);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
					ubicacionbodeLogic.getUbicacionBodes().add(ubicacionbodeLogic.getUbicacionBode());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbodes=new ArrayList<UbicacionBode>();
					this.ubicacionbodes.add(ubicacionbode);
				}
				
				if(ubicacionbodeLogic.getUbicacionBode()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionbodeLogic.getUbicacionBodesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionbodeLogic.getUbicacionBodes()==null||ubicacionbodeLogic.getUbicacionBodes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionbodes==null|| ubicacionbodes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodesAux=new ArrayList<UbicacionBode>();
						ubicacionbodesAux.addAll(ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodesAux=new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionbodeLogic.getUbicacionBodesFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionBodes("FK_IdBodega",ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionBodes("FK_IdBodega",ubicacionbodes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
						ubicacionbodeLogic.getUbicacionBodes().addAll(ubicacionbodesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodes=new ArrayList<UbicacionBode>();
							ubicacionbodes.addAll(ubicacionbodesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionbodeLogic.getUbicacionBodesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionbodeLogic.getUbicacionBodes()==null||ubicacionbodeLogic.getUbicacionBodes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionbodes==null|| ubicacionbodes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodesAux=new ArrayList<UbicacionBode>();
						ubicacionbodesAux.addAll(ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodesAux=new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionbodeLogic.getUbicacionBodesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionBodes("FK_IdEmpresa",ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionBodes("FK_IdEmpresa",ubicacionbodes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
						ubicacionbodeLogic.getUbicacionBodes().addAll(ubicacionbodesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodes=new ArrayList<UbicacionBode>();
							ubicacionbodes.addAll(ubicacionbodesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionbodeLogic.getUbicacionBodesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionbodeLogic.getUbicacionBodes()==null||ubicacionbodeLogic.getUbicacionBodes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionbodes==null|| ubicacionbodes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodesAux=new ArrayList<UbicacionBode>();
						ubicacionbodesAux.addAll(ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodesAux=new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionbodeLogic.getUbicacionBodesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionBodes("FK_IdSucursal",ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionBodes("FK_IdSucursal",ubicacionbodes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
						ubicacionbodeLogic.getUbicacionBodes().addAll(ubicacionbodesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodes=new ArrayList<UbicacionBode>();
							ubicacionbodes.addAll(ubicacionbodesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUbicacionBode")) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ubicacionbodeLogic.getUbicacionBodesFK_IdUbicacionBode(finalQueryGlobal,pagination,id_ubicacion_bodeFK_IdUbicacionBode);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ubicacionbodeLogic.getUbicacionBodes()==null||ubicacionbodeLogic.getUbicacionBodes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ubicacionbodes==null|| ubicacionbodes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodesAux=new ArrayList<UbicacionBode>();
						ubicacionbodesAux.addAll(ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodesAux=new ArrayList<UbicacionBode>();
							ubicacionbodesAux.addAll(ubicacionbodes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ubicacionbodeLogic.getUbicacionBodesFK_IdUbicacionBode(finalQueryGlobal,pagination,id_ubicacion_bodeFK_IdUbicacionBode);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UbicacionBodeConstantesFunciones.getDetalleIndiceFK_IdUbicacionBode(id_ubicacion_bodeFK_IdUbicacionBode);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUbicacionBodes("FK_IdUbicacionBode",ubicacionbodeLogic.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUbicacionBodes("FK_IdUbicacionBode",ubicacionbodes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeLogic.setUbicacionBodes(new ArrayList<UbicacionBode>());
						ubicacionbodeLogic.getUbicacionBodes().addAll(ubicacionbodesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodes=new ArrayList<UbicacionBode>();
							ubicacionbodes.addAll(ubicacionbodesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUbicacionBode();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUbicacionBode();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ubicacionbodeLogic.getUbicacionBodes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionbodes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ubicacionbodeLogic.getUbicacionBodes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ubicacionbodes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UbicacionBode ubicacionbode) {
		Boolean permite=true;
		
		if(this.ubicacionbode.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UbicacionBodeConstantesFunciones.getOrderByListaUbicacionBode();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UbicacionBodeConstantesFunciones.getOrderByListaUbicacionBode();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionBode ubicacionbode:ubicacionbodeLogic.getUbicacionBodes()) {
				if(ubicacionbode.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionbodeTotales=ubicacionbode;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionBode ubicacionbode:this.ubicacionbodes) {
				if(ubicacionbode.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionbodeTotales=ubicacionbode;
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
			this.ubicacionbodeAux=new UbicacionBode();
			this.ubicacionbodeAux.setsType(Constantes2.S_TOTALES);
			this.ubicacionbodeAux.setIsNew(false);
			this.ubicacionbodeAux.setIsChanged(false);
			this.ubicacionbodeAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UbicacionBodeConstantesFunciones.TotalizarValoresFilaUbicacionBode(this.ubicacionbodeLogic.getUbicacionBodes(),this.ubicacionbodeAux);
				
				this.ubicacionbodeLogic.getUbicacionBodes().add(this.ubicacionbodeAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UbicacionBodeConstantesFunciones.TotalizarValoresFilaUbicacionBode(this.ubicacionbodes,this.ubicacionbodeAux);
				
				this.ubicacionbodes.add(this.ubicacionbodeAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ubicacionbodeTotales=new UbicacionBode();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ubicacionbodeLogic.getUbicacionBodes().remove(ubicacionbodeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ubicacionbodes.remove(ubicacionbodeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ubicacionbodeTotales=new UbicacionBode();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UbicacionBode ubicacionbode:ubicacionbodeLogic.getUbicacionBodes()) {
				if(ubicacionbode.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionbodeTotales=ubicacionbode;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UbicacionBodeConstantesFunciones.TotalizarValoresFilaUbicacionBode(this.ubicacionbodeLogic.getUbicacionBodes(),ubicacionbodeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UbicacionBode ubicacionbode:this.ubicacionbodes) {
				if(ubicacionbode.getsType().equals(Constantes2.S_TOTALES)) {
					ubicacionbodeTotales=ubicacionbode;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UbicacionBodeConstantesFunciones.TotalizarValoresFilaUbicacionBode(this.ubicacionbodes,ubicacionbodeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUbicacionBodesFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionBodesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionBodesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUbicacionBodesFK_IdUbicacionBode()throws Exception {
		try {
			sAccionBusqueda="FK_IdUbicacionBode";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUbicacionBodesFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getUbicacionBodesFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionBodesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getUbicacionBodesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionBodesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getUbicacionBodesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUbicacionBodesFK_IdUbicacionBode(String sFinalQuery,Long id_ubicacion_bode)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLogic.getUbicacionBodesFK_IdUbicacionBode(sFinalQuery,this.pagination,id_ubicacion_bode);
				
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
	
	public void inicializarPermisosUbicacionBode() {
		this.isPermisoTodoUbicacionBode=false;
		this.isPermisoNuevoUbicacionBode=false;
		this.isPermisoActualizarUbicacionBode=false;
		this.isPermisoActualizarOriginalUbicacionBode=false;
		this.isPermisoEliminarUbicacionBode=false;
		this.isPermisoGuardarCambiosUbicacionBode=false;
		this.isPermisoConsultaUbicacionBode=false;
		this.isPermisoBusquedaUbicacionBode=false;
		this.isPermisoReporteUbicacionBode=false;		
		this.isPermisoOrdenUbicacionBode=false;		
		this.isPermisoPaginacionMedioUbicacionBode=false;		
		this.isPermisoPaginacionAltoUbicacionBode=false;
		this.isPermisoPaginacionTodoUbicacionBode=false;
		this.isPermisoCopiarUbicacionBode=false;		
		this.isPermisoVerFormUbicacionBode=false;		
		this.isPermisoDuplicarUbicacionBode=false;		
		this.isPermisoOrdenUbicacionBode=false;		
	}
	
	public void setPermisosUsuarioUbicacionBode(Boolean isPermiso) {
		this.isPermisoTodoUbicacionBode=isPermiso;
		this.isPermisoNuevoUbicacionBode=isPermiso;
		this.isPermisoActualizarUbicacionBode=isPermiso;
		this.isPermisoActualizarOriginalUbicacionBode=isPermiso;
		this.isPermisoEliminarUbicacionBode=isPermiso;
		this.isPermisoGuardarCambiosUbicacionBode=isPermiso;
		this.isPermisoConsultaUbicacionBode=isPermiso;
		this.isPermisoBusquedaUbicacionBode=isPermiso;
		this.isPermisoReporteUbicacionBode=isPermiso;
		this.isPermisoOrdenUbicacionBode=isPermiso;		
		this.isPermisoPaginacionMedioUbicacionBode=isPermiso;		
		this.isPermisoPaginacionAltoUbicacionBode=isPermiso;		
		this.isPermisoPaginacionTodoUbicacionBode=isPermiso;		
		this.isPermisoCopiarUbicacionBode=isPermiso;		
		this.isPermisoVerFormUbicacionBode=isPermiso;		
		this.isPermisoDuplicarUbicacionBode=isPermiso;
		this.isPermisoOrdenUbicacionBode=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUbicacionBode(Boolean isPermiso) {
		//this.isPermisoTodoUbicacionBode=isPermiso;
		this.isPermisoNuevoUbicacionBode=isPermiso;
		this.isPermisoActualizarUbicacionBode=isPermiso;
		this.isPermisoActualizarOriginalUbicacionBode=isPermiso;
		this.isPermisoEliminarUbicacionBode=isPermiso;
		this.isPermisoGuardarCambiosUbicacionBode=isPermiso;
		//this.isPermisoConsultaUbicacionBode=isPermiso;
		//this.isPermisoBusquedaUbicacionBode=isPermiso;
		//this.isPermisoReporteUbicacionBode=isPermiso;
		//this.isPermisoOrdenUbicacionBode=isPermiso;		
		//this.isPermisoPaginacionMedioUbicacionBode=isPermiso;		
		//this.isPermisoPaginacionAltoUbicacionBode=isPermiso;		
		//this.isPermisoPaginacionTodoUbicacionBode=isPermiso;		
		//this.isPermisoCopiarUbicacionBode=isPermiso;		
		//this.isPermisoDuplicarUbicacionBode=isPermiso;
		//this.isPermisoOrdenUbicacionBode=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUbicacionBodeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(UbicacionBodeConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(UbicacionProduConstantesFunciones.SNOMBREOPCION);
		
		if(UbicacionBodeJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosUbicacionBode=false;
		this.isTienePermisosUbicacionBode=this.verificarGetPermisosUsuarioOpcionUbicacionBodeClaseRelacionada(this.opcionsRelacionadas,UbicacionBodeConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosUbicacionProdu=false;
		this.isTienePermisosUbicacionProdu=this.verificarGetPermisosUsuarioOpcionUbicacionBodeClaseRelacionada(this.opcionsRelacionadas,UbicacionProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebUbicacionBode(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUbicacionBodeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosUbicacionBode=conPermiso;
		this.isTienePermisosUbicacionProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioUbicacionBodeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUbicacionBodeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUbicacionBodeClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosUbicacionBode && this.jInternalFrameDetalleFormUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.remove(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosUbicacionProdu && this.jInternalFrameDetalleFormUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.remove(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioUbicacionBode() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UbicacionBodeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UbicacionBodeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUbicacionBode=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUbicacionBode=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUbicacionBode=this.isPermisoActualizarUbicacionBode;
			this.isPermisoEliminarUbicacionBode=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUbicacionBode=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUbicacionBode=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUbicacionBode=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUbicacionBode=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUbicacionBode=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUbicacionBode=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUbicacionBode=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUbicacionBode=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUbicacionBode=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUbicacionBode=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUbicacionBode=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUbicacionBode=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUbicacionBode=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUbicacionBode.setToolTipText(this.jTableDatosUbicacionBode.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUbicacionBode(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUbicacionBode(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UbicacionBodeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UbicacionBodeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUbicacionBode() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosUbicacionBode && this.ubicacionbodeConstantesFunciones.mostrarUbicacionBodeUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Ubicacion Bode");
			reporte.setsDescripcion("Ubicacion Bode");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosUbicacionProdu && this.ubicacionbodeConstantesFunciones.mostrarUbicacionProduUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Ubicacion Producto");
			reporte.setsDescripcion("Ubicacion Producto");
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
	public void inicializarCombosForeignKeyUbicacionBodeListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.ubicacionbodesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUbicacionBodeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UbicacionBodeJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUbicacionBodeListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUbicacionBodeListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUbicacionBodeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ubicacionbodesForeignKey==null||this.ubicacionbodesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UbicacionBodeConstantesFunciones.SFINALQUERY;

				this.cargarCombosUbicacionBodesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUbicacionBodeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UbicacionBodeParameterReturnGeneral ubicacionbodeReturnGeneral=new UbicacionBodeParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.ubicacionbodeConstantesFunciones.cargarid_empresaUbicacionBode)
					 || (this.esRecargarFks && this.ubicacionbodeConstantesFunciones.cargarid_empresaUbicacionBode)) {

					if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+ubicacionbodeSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.ubicacionbodeConstantesFunciones.cargarid_sucursalUbicacionBode)
					 || (this.esRecargarFks && this.ubicacionbodeConstantesFunciones.cargarid_sucursalUbicacionBode)) {

					if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+ubicacionbodeSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.ubicacionbodeConstantesFunciones.cargarid_bodegaUbicacionBode)
					 || (this.esRecargarFks && this.ubicacionbodeConstantesFunciones.cargarid_bodegaUbicacionBode)) {

					if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+ubicacionbodeSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalUbicacionBode="";

				if(((this.ubicacionbodesForeignKey==null||this.ubicacionbodesForeignKey.size()<=0) && this.ubicacionbodeConstantesFunciones.cargarid_ubicacion_bodeUbicacionBode)
					 || (this.esRecargarFks && this.ubicacionbodeConstantesFunciones.cargarid_ubicacion_bodeUbicacionBode)) {

					if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UbicacionBodeConstantesFunciones.getArrayColumnasGlobalesUbicacionBode(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUbicacionBode=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UbicacionBodeConstantesFunciones.TABLENAME);

						finalQueryGlobalUbicacionBode=Funciones.GetFinalQueryAppend(finalQueryGlobalUbicacionBode, "");
						finalQueryGlobalUbicacionBode+=UbicacionBodeConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUbicacionBodesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUbicacionBode=" WHERE " + ConstantesSql.ID + "="+ubicacionbodeSessionBean.getlidUbicacionBodeActual();
					}
				} else {
					finalQueryGlobalUbicacionBode="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ubicacionbodeReturnGeneral=ubicacionbodeLogic.cargarCombosLoteForeignKeyUbicacionBode(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalUbicacionBode);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=ubicacionbodeReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=ubicacionbodeReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=ubicacionbodeReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalUbicacionBode.equals("NONE")) {
				this.ubicacionbodesForeignKey=ubicacionbodeReturnGeneral.getubicacionbodesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUbicacionBode()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyUbicacionBode();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyUbicacionBode()throws Exception {
		try {

			if(!this.ubicacionbodeSessionBean.getisBusquedaDesdeForeignKeySesionUbicacionBode()) {
				UbicacionBode ubicacionbode=new UbicacionBode();
				UbicacionBodeConstantesFunciones.setUbicacionBodeDescripcion(ubicacionbode,Constantes.SMENSAJE_ESCOJA_OPCION);
				ubicacionbode.setId(null);

				if(!UbicacionBodeConstantesFunciones.ExisteEnLista(this.ubicacionbodesForeignKey,ubicacionbode,true)) {

					this.ubicacionbodesForeignKey.add(0,ubicacionbode);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUbicacionBode()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUbicacionBode(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUbicacionBode()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionBode();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUbicacionBode(UbicacionBode ubicacionbode)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(ubicacionbode.getid_bodega(),false,"Formulario");
			this.setActualUbicacionBodeForeignKey(ubicacionbode.getid_ubicacion_bode(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUbicacionBode(UbicacionBode ubicacionbode,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUbicacionBode()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.ubicacionbodeConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualUbicacionBodeForeignKey(this.ubicacionbodeConstantesFunciones.getid_ubicacion_bode(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUbicacionBode()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUbicacionBode()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUbicacionBode()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUbicacionBode()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUbicacionBode()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameUbicacionBodesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUbicacionBode(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUbicacionBodesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUbicacionBode()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.getItemCount()>0) {
				this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public UbicacionBodeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UbicacionBodeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UbicacionBodeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean(); 
		this.ubicacionbodeConstantesFunciones=new UbicacionBodeConstantesFunciones(); 
		this.ubicacionbodeBean=new UbicacionBode();//(this.ubicacionbodeConstantesFunciones); 		
		this.ubicacionbodeReturnGeneral=new UbicacionBodeParameterReturnGeneral(); 
		
		this.ubicacionbodeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ubicacionbodeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UbicacionBodeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UbicacionBodeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UbicacionBodeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUbicacionBode(true);
			
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
			
			this.ubicacionbodeConstantesFunciones=new UbicacionBodeConstantesFunciones(); 
			this.ubicacionbodeBean=new UbicacionBode();//this.ubicacionbodeConstantesFunciones); 			
			this.ubicacionbodeReturnGeneral=new UbicacionBodeParameterReturnGeneral(); 
		
			UbicacionBodeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ubicacion Bode Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ubicacionbode=new UbicacionBode();
			this.ubicacionbodes = new ArrayList<UbicacionBode>();
			this.ubicacionbodesAux = new ArrayList<UbicacionBode>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic=new UbicacionBodeLogic();
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			//this.ubicacionbodeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ubicacionbodeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUbicacionBode);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUbicacionBode);	
					}
					
					if(this.jInternalFrameImportacionUbicacionBode!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUbicacionBode);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUbicacionBode!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUbicacionBode);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUbicacionBode);
				this.jInternalFrameDetalleFormUbicacionBode.setVisible(false);
				this.jInternalFrameDetalleFormUbicacionBode.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUbicacionBode);
					this.jInternalFrameReporteDinamicoUbicacionBode.setVisible(false);
					this.jInternalFrameReporteDinamicoUbicacionBode.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUbicacionBode!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUbicacionBode);
					this.jInternalFrameImportacionUbicacionBode.setVisible(false);
					this.jInternalFrameImportacionUbicacionBode.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUbicacionBode!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUbicacionBode);
					this.jInternalFrameOrderByUbicacionBode.setVisible(false);
					this.jInternalFrameOrderByUbicacionBode.setSelected(false);				
				}
				
			}
			
			this.ubicacionbodesArbol= new ArrayList<UbicacionBode>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeUbicacionBode);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeUbicacionBode);
			this.jInternalFrameTreeUbicacionBode.setVisible(false);
	        this.jInternalFrameTreeUbicacionBode.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosUbicacionBodeArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUbicacionBodeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UbicacionBodeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ubicacionbodeReturnGeneral=new UbicacionBodeParameterReturnGeneral();
			
			this.ubicacionbodeParameterGeneral=new UbicacionBodeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ubicacionbodeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UbicacionBodeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(UbicacionBodeConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(UbicacionProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UbicacionBodeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ubicacionbodeSessionBean.getEsGuardarRelacionado(),this.ubicacionbodeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UbicacionBodeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ubicacionbodeSessionBean.getEsGuardarRelacionado(),this.ubicacionbodeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaDuplicarUbicacionBode=true;
			this.isVisibilidadCeldaCopiarUbicacionBode=true;
			this.isVisibilidadCeldaVerFormUbicacionBode=true;
			this.isVisibilidadCeldaOrdenUbicacionBode=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=false;
			this.isVisibilidadCeldaGuardarUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUbicacionBode=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUbicacionBode();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUbicacionBode(false);
			
			this.setPermisosUsuarioUbicacionBode();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado() 
				|| (this.ubicacionbodeSessionBean.getEsGuardarRelacionado() && this.ubicacionbodeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUbicacionBodeClasesRelacionadas();
			}
			
			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUbicacionBodeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUbicacionBode();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUbicacionBode();
			}
			
			if(!this.isPermisoBusquedaUbicacionBode) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUbicacionBode,this.isPermisoPaginacionMedioUbicacionBode,this.isPermisoPaginacionTodoUbicacionBode);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UbicacionBodeConstantesFunciones.getTiposSeleccionarUbicacionBode());
				
				this.tiposColumnasSelect=UbicacionBodeConstantesFunciones.getTiposSeleccionarUbicacionBode(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectUbicacionBode();				
				//this.tiposRelacionesSelect=UbicacionBodeConstantesFunciones.getTiposRelacionesUbicacionBode(true);
				
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
			//if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUbicacionBode();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUbicacionBode(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUbicacionBode(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionBode() ;
			
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
			
			
			this.ubicacionproduLogic=new UbicacionProduLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.bodegaLogic=new BodegaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ubicacionbodeImplementable= (UbicacionBodeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UbicacionBodeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ubicacionbodeImplementableHome= (UbicacionBodeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UbicacionBodeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ubicacionbodes= new ArrayList<UbicacionBode>();
			this.ubicacionbodesEliminados= new ArrayList<UbicacionBode>();
						
			this.isEsNuevoUbicacionBode=false;
			this.esParaAccionDesdeFormularioUbicacionBode=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUbicacionBode(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUbicacionBode();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UbicacionBodeBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UbicacionBodeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUbicacionBode("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUbicacionBode(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUbicacionBode();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUbicacionBode();
			}
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUbicacionBode.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUbicacionBode.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUbicacionBode.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUbicacionBode(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UbicacionBode: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUbicacionBode() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUbicacionBode")) {
				iIndex=this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();	
				
				

				if(sTitle.equals("Ubicacion Bodes")) {
					if(!UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUbicacionBode();

						this.cargarParteTabPanelRelacionadaUbicacionBode(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Ubicacion Productos")) {
					if(!UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUbicacionBode();

						this.cargarParteTabPanelRelacionadaUbicacionProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUbicacionBode();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaUbicacionBode(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUbicacionBode.cargarSessionConBeanSwingJInternalFrameUbicacionBode(false,true,iIndex);
		this.jButtonUbicacionBodeActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUbicacionBode();

		//this.jTabbedPaneRelacionesUbicacionBode.updateUI();
		//this.jTabbedPaneRelacionesUbicacionBode.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUbicacionBode.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaUbicacionProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUbicacionBode.cargarSessionConBeanSwingJInternalFrameUbicacionProdu(false,true,iIndex);
		this.jButtonUbicacionProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaUbicacionProdu();

		//this.jTabbedPaneRelacionesUbicacionBode.updateUI();
		//this.jTabbedPaneRelacionesUbicacionBode.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUbicacionBode.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("UbicacionBode")) {
				int row=this.jTableDatosUbicacionBode.getSelectedRow();
				jButtonUbicacionBodeActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("UbicacionProdu")) {
				int row=this.jTableDatosUbicacionBode.getSelectedRow();
				jButtonUbicacionProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Ubicacion Bode")) {

					if(this.isTienePermisosUbicacionBode && this.ubicacionbodeConstantesFunciones.mostrarUbicacionBodeUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Ubicacion Bodes"+"("+UbicacionBodeConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Ubicacion Bodes");

						if(ubicacionbodeConstantesFunciones.resaltarUbicacionBodeUbicacionBode!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(ubicacionbodeConstantesFunciones.resaltarUbicacionBodeUbicacionBode);
						}

						jmenuItem.setEnabled(this.ubicacionbodeConstantesFunciones.activarUbicacionBodeUbicacionBode);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UbicacionBode"));

						

						this.jInternalFrameDetalleFormUbicacionBode.jmenuDetalleUbicacionBode.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Ubicacion Producto")) {

					if(this.isTienePermisosUbicacionProdu && this.ubicacionbodeConstantesFunciones.mostrarUbicacionProduUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Ubicacion Productos"+"("+UbicacionProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Ubicacion Productos");

						if(ubicacionbodeConstantesFunciones.resaltarUbicacionProduUbicacionBode!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(ubicacionbodeConstantesFunciones.resaltarUbicacionProduUbicacionBode);
						}

						jmenuItem.setEnabled(this.ubicacionbodeConstantesFunciones.activarUbicacionProduUbicacionBode);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"UbicacionProdu"));

						

						this.jInternalFrameDetalleFormUbicacionBode.jmenuDetalleUbicacionBode.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyUbicacionBode(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUbicacionBode(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUbicacionBode(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUbicacionBodeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUbicacionBode();
		
		this.cargarCombosFrameForeignKeyUbicacionBode();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUbicacionBode();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUbicacionBode();
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

	public void cargarCombosForeignKeyUbicacionBode(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUbicacionBodeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUbicacionBode();
				this.cargarCombosFrameUbicacionBodesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUbicacionBode(this.ubicacionbodesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUbicacionBodeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			
			if(jTableDatosUbicacionBode.getRowCount()>=1) {
				jTableDatosUbicacionBode.removeRowSelectionInterval(0, jTableDatosUbicacionBode.getRowCount()-1);						
			}
			
			this.isEsNuevoUbicacionBode=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUbicacionBode(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUbicacionBode(true);			
			//this.ubicacionbode=new UbicacionBode();
			//this.ubicacionbode.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionBode(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionBode() ;
			
			if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionBode(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ubicacionbode);	
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);				
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UbicacionBode: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUbicacionBodeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUbicacionBode.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUbicacionBode.getSelectedRows().length;			
			}
			
			ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUbicacionBode--;			
				//UbicacionBode ubicacionbodeAux= new UbicacionBode();			
				//ubicacionbodeAux.setId(this.iIdNuevoUbicacionBode);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UbicacionBode ubicacionbodeOrigen=new UbicacionBode();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UbicacionBode ubicacionbodeOrigen : ubicacionbodesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ubicacionbodeOrigen =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ubicacionbodeOrigen =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUbicacionBode();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ubicacionbode.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUbicacionBode(ubicacionbodeOrigen,this.ubicacionbode,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ubicacionbodeLogic.getUbicacionBodes().add(this.ubicacionbodeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ubicacionbodes.add(this.ubicacionbodeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUbicacionBode(false);
				
				this.jTableDatosUbicacionBode.setRowSelectionInterval(this.getIndiceNuevoUbicacionBode(), this.getIndiceNuevoUbicacionBode());
				
				int iLastRow =  this.jTableDatosUbicacionBode.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUbicacionBode.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUbicacionBode.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionBode(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();									
		
			UbicacionBode ubicacionbodeOrigen=new UbicacionBode();
			UbicacionBode ubicacionbodeDestino=new UbicacionBode();
				
			ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUbicacionBode.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ubicacionbodesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUbicacionBode.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeOrigen =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ubicacionbodeOrigen =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ubicacionbodeDestino =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ubicacionbodeDestino =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ubicacionbodeOrigen =ubicacionbodesSeleccionados.get(0);
				ubicacionbodeDestino =ubicacionbodesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUbicacionBode(ubicacionbodeOrigen,ubicacionbodeDestino,true,false);
				
				ubicacionbodeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ubicacionbodeDestino,ubicacionbodeLogic.getUbicacionBodes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ubicacionbodeDestino,ubicacionbodes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUbicacionBode(false);
				
				//this.jTableDatosUbicacionBode.setRowSelectionInterval(this.getIndiceNuevoUbicacionBode(), this.getIndiceNuevoUbicacionBode());
				
				int iLastRow =  this.jTableDatosUbicacionBode.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUbicacionBode.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUbicacionBode.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionBode(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUbicacionBode.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUbicacionBode.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUbicacionBode.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUbicacionBode.setVisible(!isVisible);
			this.jPanelPaginacionUbicacionBode.setVisible(!isVisible);
			this.jPanelAccionesUbicacionBode.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUbicacionBode();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUbicacionBode();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUbicacionBode();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUbicacionBode();
			
			this.abrirFrameOrderByUbicacionBode();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUbicacionBode();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUbicacionBode(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUbicacionBode);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUbicacionBode.isMaximum()) {
					this.jInternalFrameDetalleFormUbicacionBode.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUbicacionBode.setSize(this.jInternalFrameDetalleFormUbicacionBode.iWidthFormulario,this.jInternalFrameDetalleFormUbicacionBode.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUbicacionBode.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUbicacionBode.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUbicacionBode.isMaximum()) {
						this.jInternalFrameDetalleFormUbicacionBode.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth(),UbicacionBodeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth(),UbicacionBodeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth(),UbicacionBodeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUbicacionBode();
					}

					if(UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaUbicacionProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUbicacionBode.setVisible(true);
	        this.jInternalFrameDetalleFormUbicacionBode.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUbicacionBode() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUbicacionBode==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUbicacionBode=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionBode,false,this);
				} else {
					this.jInternalFrameOrderByUbicacionBode=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUbicacionBode,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUbicacionBode);
				this.jInternalFrameOrderByUbicacionBode.setVisible(false);
				this.jInternalFrameOrderByUbicacionBode.setSelected(false);
				
				this.jInternalFrameOrderByUbicacionBode.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUbicacionBode"));
				
				this.inicializarActualizarBindingTablaOrderByUbicacionBode();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUbicacionBode() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUbicacionBode==null) {
				
				this.jInternalFrameImportacionUbicacionBode=new ImportacionJInternalFrame(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUbicacionBode);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUbicacionBode);
				this.jInternalFrameImportacionUbicacionBode.setVisible(false);
				this.jInternalFrameImportacionUbicacionBode.setSelected(false);


				this.jInternalFrameImportacionUbicacionBode.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUbicacionBode"));
				this.jInternalFrameImportacionUbicacionBode.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUbicacionBode"));
				this.jInternalFrameImportacionUbicacionBode.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUbicacionBode"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUbicacionBode() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUbicacionBode==null) {
				this.jInternalFrameReporteDinamicoUbicacionBode=new ReporteDinamicoJInternalFrame(UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUbicacionBode);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUbicacionBode);
				this.jInternalFrameReporteDinamicoUbicacionBode.setVisible(false);
				this.jInternalFrameReporteDinamicoUbicacionBode.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionBode"));
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionBode"));
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionBode"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionBode();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaUbicacionBode() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaUbicacionProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.jScrollPanelDatosUbicacionProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUbicacionBode.jContentPaneDetalleUbicacionBode.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.jScrollPanelDatosUbicacionProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.jScrollPanelDatosUbicacionProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.jScrollPanelDatosUbicacionProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleUbicacionBode() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUbicacionBode);
			
	       	this.jInternalFrameDetalleFormUbicacionBode.setVisible(false);
	        this.jInternalFrameDetalleFormUbicacionBode.setSelected(false);
			
			//this.jInternalFrameDetalleFormUbicacionBode.dispose();
			//this.jInternalFrameDetalleFormUbicacionBode=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUbicacionBode() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUbicacionBode.setVisible(true);
	        this.jInternalFrameReporteDinamicoUbicacionBode.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUbicacionBode() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUbicacionBode.setVisible(true);
	        this.jInternalFrameImportacionUbicacionBode.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUbicacionBode() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUbicacionBode.setVisible(true);
	        this.jInternalFrameOrderByUbicacionBode.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUbicacionBode() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUbicacionBode.setVisible(false);
	        this.jInternalFrameOrderByUbicacionBode.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUbicacionBode() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUbicacionBode.setVisible(false);
	        this.jInternalFrameReporteDinamicoUbicacionBode.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUbicacionBode() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUbicacionBode.setVisible(false);
	        this.jInternalFrameImportacionUbicacionBode.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeUbicacionBode(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeUbicacionBode);
			
			this.jInternalFrameTreeUbicacionBode.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeUbicacionBode.sTipoBusqueda="UbicacionBode";
			}
			
			this.jInternalFrameTreeUbicacionBode.setUbicacionBodes(this.ubicacionbodesArbol);
			this.jInternalFrameTreeUbicacionBode.CargarTreeUbicacionBode();
			
	       	this.jInternalFrameTreeUbicacionBode.setVisible(true);
	        this.jInternalFrameTreeUbicacionBode.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeUbicacionBode() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeUbicacionBode);
			
	       	this.jInternalFrameTreeUbicacionBode.setVisible(false);
	        this.jInternalFrameTreeUbicacionBode.setSelected(false);
			
			//this.jInternalFrameTreeUbicacionBode.dispose();
			//this.jInternalFrameTreeUbicacionBode=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void jButtonModificarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUbicacionBode(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUbicacionBode(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUbicacionBode(true);
			//this.isEsNuevoUbicacionBode=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUbicacionBode("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionBode(false) ;
			
			if(ubicacionbodeSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.getEsGuardarRelacionado() && UbicacionBodeJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUbicacionBodeActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.getEsGuardarRelacionado() && UbicacionProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonUbicacionProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionBode(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionBode(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUbicacionBodeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUbicacionBode(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUbicacionBode(true);
			//this.isEsNuevoUbicacionBode=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ubicacionbode.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUbicacionBode("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUbicacionBode(false) ;
			
			if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUbicacionBode(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionBode(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUbicacionBode.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUbicacionBode(List<UbicacionBode> ubicacionbodesForeignKey)throws Exception{
		TableColumn tableColumnUbicacionBode=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE));
		TableCellEditor tableCellEditorUbicacionBode =tableColumnUbicacionBode.getCellEditor();

		UbicacionBodeTableCell ubicacionbodeTableCellFk=(UbicacionBodeTableCell)tableCellEditorUbicacionBode;

		if(ubicacionbodeTableCellFk!=null) {
			ubicacionbodeTableCellFk.setubicacionbodesForeignKey(ubicacionbodesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUbicacionBode.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ubicacionbodeTableCellFk.setRowActual(intSelectedRow);
			//ubicacionbodeTableCellFk.setubicacionbodesForeignKeyActual(ubicacionbodesForeignKey);
		//}


		if(ubicacionbodeTableCellFk!=null) {
			ubicacionbodeTableCellFk.RecargarUbicacionBodesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUbicacionBode(false);
			
			//if(!this.isEsNuevoUbicacionBode) {								
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				
			}
			
			if(this.permiteMantenimiento(this.ubicacionbode)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUbicacionBode=true;
					this.inicializarActualizarBindingTablaUbicacionBode(false);
					this.isEsNuevoUbicacionBode=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUbicacionBode=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUbicacionBode=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUbicacionBode(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionBode(false);
				
				this.habilitarDeshabilitarControlesUbicacionBode(false);
			
												
				
				if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUbicacionBode();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUbicacionBodeActionPerformed(evt,ubicacionbodeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUbicacionBode(this.ubicacionbode,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUbicacionBode.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ubicacionbodeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ubicacionbode.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				this.ubicacionbode.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				this.ubicacionbode.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ubicacionbode)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UbicacionBodeModel) this.jTableDatosUbicacionBode.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUbicacionBode=true;
				this.inicializarActualizarBindingTablaUbicacionBode(false);
				this.isEsNuevoUbicacionBode=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUbicacionBode(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionBode(false);
				
				this.habilitarDeshabilitarControlesUbicacionBode(false);
				
				
				
				if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUbicacionBode();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUbicacionBode.getRowCount()>=1) {
				jTableDatosUbicacionBode.removeRowSelectionInterval(0, jTableDatosUbicacionBode.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUbicacionBode(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUbicacionBode(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUbicacionBode(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUbicacionBode(false) ;
			
			this.isEsNuevoUbicacionBode=false;
			
			if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUbicacionBode();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUbicacionBode(false);
				
				//SI ES MANUAL
				if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUbicacionBode();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUbicacionBode--;			
			//UbicacionBode ubicacionbodeAux= new UbicacionBode();			
			//ubicacionbodeAux.setId(this.iIdNuevoUbicacionBode);
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUbicacionBode();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
			
			this.ubicacionbode.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ubicacionbodeLogic.getUbicacionBodes().add(this.ubicacionbodeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ubicacionbodes.add(this.ubicacionbodeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUbicacionBode(false);
			
			this.jTableDatosUbicacionBode.setRowSelectionInterval(this.getIndiceNuevoUbicacionBode(), this.getIndiceNuevoUbicacionBode());
			
			int iLastRow =  this.jTableDatosUbicacionBode.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUbicacionBode.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUbicacionBode.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUbicacionBode(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionBode(false);
			
			//SI ES MANUAL
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionBode();
			}
			
			//this.abrirFrameTreeUbicacionBode();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Ubicacion BodeS ?", "MANTENIMIENTO DE Ubicacion Bode", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUbicacionBode.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUbicacionBode();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ubicacionbodeReturnGeneral=ubicacionbodeLogic.procesarImportacionUbicacionBodesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ubicacionbodeParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUbicacionBodeReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUbicacionBode.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUbicacionBode.setFileImportacion(this.jInternalFrameImportacionUbicacionBode.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUbicacionBode.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUbicacionBode.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUbicacionBode.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUbicacionBode.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		

		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UbicacionBodeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UbicacionBodeBaseDesign.jrxml";
			
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
			
			this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UbicacionBode_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UbicacionBode_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UbicacionBode_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UbicacionBode_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_NIVEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_vel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_vel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_vel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_vel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UbicacionBodeConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUbicacionBode.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE:
					sNombreCampoCategoria="id_ubicacion_bode";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoria="nivel";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE:
					sNombreCampoCategoriaValor="id_ubicacion_bode";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoriaValor="nivel";
					break;

				case UbicacionBodeConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ubicacion_bode");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NIVEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nivel");
					break;

				case UbicacionBodeConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
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
	
	public void jButtonGenerarExcelReporteDinamicoUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UbicacionBodes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getubicacionbode_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_NIVEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NIVEL);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getnivel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UbicacionBodeConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(UbicacionBode ubicacionbode:ubicacionbodesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ubicacionbode.getorden());
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
			//	this.getFilaCabeceraExportarExcelUbicacionBode(row);				
			//	iRow++;
			//}				
			
			//for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUbicacionBode(ubicacionbodeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeUbicacionBode("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionBode(false);
			
			//SI ES MANUAL
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUbicacionBode();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionBode(false);
			
			//SI ES MANUAL
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUbicacionBode();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUbicacionBode(false);
			
			//SI ES MANUAL
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUbicacionBode();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUbicacionBode() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUbicacionBode.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUbicacionBode.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUbicacionBode.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUbicacionBode.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUbicacionBode.setMinimumSize(dimensionMinimum);
		this.jTableDatosUbicacionBode.setMaximumSize(dimensionMaximum);
		this.jTableDatosUbicacionBode.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUbicacionBode(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUbicacionBode(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUbicacionBode(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUbicacionBode(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUbicacionBode(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUbicacionBode(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionBode(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUbicacionBode(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUbicacionBode() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUbicacionBode();
		
		this.inicializarActualizarBindingBotonesManualUbicacionBode(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUbicacionBode();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionBode() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionBode(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionBode(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUbicacionBode.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUbicacionBode.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUbicacionBode.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionNuevoUbicacionBode.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionSinCerrarUbicacionBode.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionSinMensajeUbicacionBode.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUbicacionBode.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUbicacionBode.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUbicacionBode.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
				this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionNuevoUbicacionBode.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionSinCerrarUbicacionBode.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUbicacionBode.jCheckBoxPostAccionSinMensajeUbicacionBode.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUbicacionBode.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUbicacionBode.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUbicacionBode.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUbicacionBode.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUbicacionBode.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUbicacionBode.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUbicacionBode.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUbicacionBode.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUbicacionBode.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUbicacionBode(Boolean esInicializar) throws Exception {
		try	{	
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUbicacionBode(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUbicacionBode() throws Exception {
		try	{
			if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUbicacionBode();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUbicacionBode() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUbicacionBode() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUbicacionBode.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUbicacionBode.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUbicacionBode.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUbicacionBode.addItem(reporte);
			}
			
			
			if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUbicacionBode.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUbicacionBode.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUbicacionBode.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUbicacionBode.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUbicacionBode.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUbicacionBode.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUbicacionBode.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionBode();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUbicacionBode() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
				this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
				this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUbicacionBode.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
				
				if(this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUbicacionBode.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUbicacionBode.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUbicacionBode.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUbicacionBode.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUbicacionBode()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaUbicacionBode.getSelectedItem()).getId();}
		if(this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.getSelectedItem()!=null){this.id_ubicacion_bodeFK_IdUbicacionBode=((UbicacionBode)this.jComboBoxid_ubicacion_bodeFK_IdUbicacionBodeUbicacionBode.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUbicacionBode(Boolean esInicializar) throws Exception {				
		if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUbicacionBode();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUbicacionBode() throws Exception {
		this.inicializarActualizarBindingTablaUbicacionBode(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUbicacionBode() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUbicacionBodeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBodeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUbicacionBode(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ubicacionbodeLogic.getUbicacionBodes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ubicacionbodes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUbicacionBode.setModel(new UbicacionBodeModel(this.ubicacionbodeLogic.getUbicacionBodes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUbicacionBode.setModel(new UbicacionBodeModel(this.ubicacionbodes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUbicacionBode!=null && this.jInternalFrameOrderByUbicacionBode.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUbicacionBode();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,ubicacionbodeConstantesFunciones.resaltarSeleccionarUbicacionBode,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO,ubicacionbodeConstantesFunciones.resaltarSeleccionarUbicacionBode,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_ID));

		if(this.ubicacionbodeConstantesFunciones.mostraridUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ubicacionbodeConstantesFunciones.resaltaridUbicacionBode,this.ubicacionbodeConstantesFunciones.activaridUbicacionBode,this,true,"idUbicacionBode","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ubicacionbodeConstantesFunciones.resaltaridUbicacionBode,this.ubicacionbodeConstantesFunciones.activaridUbicacionBode,this,true,"idUbicacionBode","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA));

		if(this.ubicacionbodeConstantesFunciones.mostrarid_empresaUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_empresaUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_empresaUbicacionBode));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_empresaUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_empresaUbicacionBode,false,"id_empresaUbicacionBode","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.ubicacionbodeConstantesFunciones.mostrarid_sucursalUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_sucursalUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_sucursalUbicacionBode));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_sucursalUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_sucursalUbicacionBode,false,"id_sucursalUbicacionBode","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDBODEGA));

		if(this.ubicacionbodeConstantesFunciones.mostrarid_bodegaUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_bodegaUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_bodegaUbicacionBode));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_bodegaUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_bodegaUbicacionBode,true,"id_bodegaUbicacionBode","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE));

		if(this.ubicacionbodeConstantesFunciones.mostrarid_ubicacion_bodeUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UbicacionBodeTableCell(this.ubicacionbodesForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_ubicacion_bodeUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_ubicacion_bodeUbicacionBode));
			tableColumn.setCellEditor(new UbicacionBodeTableCell(this.ubicacionbodesForeignKey,this.ubicacionbodeConstantesFunciones.resaltarid_ubicacion_bodeUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarid_ubicacion_bodeUbicacionBode,true,"id_ubicacion_bodeUbicacionBode","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_NOMBRE));

		if(this.ubicacionbodeConstantesFunciones.mostrarnombreUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ubicacionbodeConstantesFunciones.resaltarnombreUbicacionBode,this.ubicacionbodeConstantesFunciones.activarnombreUbicacionBode,this,true,"nombreUbicacionBode","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ubicacionbodeConstantesFunciones.resaltarnombreUbicacionBode,this.ubicacionbodeConstantesFunciones.activarnombreUbicacionBode,this,true,"nombreUbicacionBode","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_NIVEL));

		if(this.ubicacionbodeConstantesFunciones.mostrarnivelUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_NIVEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ubicacionbodeConstantesFunciones.resaltarnivelUbicacionBode,this.ubicacionbodeConstantesFunciones.activarnivelUbicacionBode,this,true,"nivelUbicacionBode","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ubicacionbodeConstantesFunciones.resaltarnivelUbicacionBode,this.ubicacionbodeConstantesFunciones.activarnivelUbicacionBode,this,true,"nivelUbicacionBode","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,UbicacionBodeConstantesFunciones.LABEL_ORDEN));

		if(this.ubicacionbodeConstantesFunciones.mostrarordenUbicacionBode && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UbicacionBodeConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ubicacionbodeConstantesFunciones.resaltarordenUbicacionBode,this.ubicacionbodeConstantesFunciones.activarordenUbicacionBode,this,true,"ordenUbicacionBode","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ubicacionbodeConstantesFunciones.resaltarordenUbicacionBode,this.ubicacionbodeConstantesFunciones.activarordenUbicacionBode,this,true,"ordenUbicacionBode","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UbicacionBodePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosUbicacionBode && this.ubicacionbodeConstantesFunciones.mostrarUbicacionBodeUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Ubicacion Bodes");
				tableColumn.setHeaderValue("Ubicacion Bodes");
				tableColumn.setCellRenderer(new UbicacionBodeTableCell(ubicacionbodeConstantesFunciones.resaltarUbicacionBodeUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarUbicacionBodeUbicacionBode));
				tableColumn.setCellEditor(new UbicacionBodeTableCell(ubicacionbodeConstantesFunciones.resaltarUbicacionBodeUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarUbicacionBodeUbicacionBode));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUbicacionBode.addColumn(tableColumn);
			}

			if(this.isTienePermisosUbicacionProdu && this.ubicacionbodeConstantesFunciones.mostrarUbicacionProduUbicacionBode && !UbicacionBodeConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Ubicacion Productos");
				tableColumn.setHeaderValue("Ubicacion Productos");
				tableColumn.setCellRenderer(new UbicacionProduTableCell(ubicacionbodeConstantesFunciones.resaltarUbicacionProduUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarUbicacionProduUbicacionBode));
				tableColumn.setCellEditor(new UbicacionProduTableCell(ubicacionbodeConstantesFunciones.resaltarUbicacionProduUbicacionBode,this,this.ubicacionbodeConstantesFunciones.activarUbicacionProduUbicacionBode));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUbicacionBode.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUbicacionBode.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUbicacionBode.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ubicacionbodeSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUbicacionBode.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosUbicacionBode.addColumn(tableColumn);
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
			
			this.jTableDatosUbicacionBode.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUbicacionBode.moveColumn(this.jTableDatosUbicacionBode.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUbicacionBode.moveColumn(this.jTableDatosUbicacionBode.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosUbicacionBode.moveColumn(this.jTableDatosUbicacionBode.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUbicacionBode.moveColumn(this.jTableDatosUbicacionBode.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUbicacionBode.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUbicacionBode.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUbicacionBode,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUbicacionBode.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUbicacionBode.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUbicacionBode.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUbicacionBode.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUbicacionBode.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ubicacionbodeLogic.getUbicacionBodes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ubicacionbodes.size()-1;
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
		//this.jTableDatosUbicacionBode.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUbicacionBode.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUbicacionBode();
			
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
				
				//this.isEsNuevoUbicacionBode=false;
					
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
				if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUbicacionBode==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUbicacionBode.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUbicacionBode.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ubicacionbode.getsType().equals("DUPLICADO")
				   || this.ubicacionbode.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUbicacionBode=true;
				
				} else {
					this.isEsNuevoUbicacionBode=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					if(this.ubicacionbode.getId()>=0 && !this.ubicacionbode.getIsNew()) {						
						this.isEsNuevoUbicacionBode=false;
						
					} else {
						this.isEsNuevoUbicacionBode=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUbicacionBode(esRelaciones);						
				
				this.seleccionarUbicacionBode(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ubicacionbode.getId()<0) {
					this.isEsNuevoUbicacionBode=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUbicacionBode(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUbicacionBode(evt,rowIndex);
				}	
				
				if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UbicacionBode: " + this.dDif); 
					}
				}								
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUbicacionBode(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ubicacionbode)) {
					if(this.ubicacionbode.getId()>0) {
						this.ubicacionbode.setIsDeleted(true);
						
						this.ubicacionbodesEliminados.add(this.ubicacionbode);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ubicacionbodeLogic.getUbicacionBodes().remove(this.ubicacionbode);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ubicacionbodes.remove(this.ubicacionbode);				
					}
					
					
					((UbicacionBodeModel) this.jTableDatosUbicacionBode.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUbicacionBode(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUbicacionBode(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUbicacionBode) {
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUbicacionBode.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUbicacionBode.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUbicacionBode(this.ubicacionbode);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.ubicacionbodeConstantesFunciones.cargarid_empresaUbicacionBode || this.ubicacionbodeConstantesFunciones.event_dependid_empresaUbicacionBode) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ubicacionbode.getid_empresa());
									//this.inicializarActualizarBindingUbicacionBode(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ubicacionbode.getEmpresa()!=null) {
							this.empresasForeignKey.add(ubicacionbode.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ubicacionbode.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.ubicacionbodeConstantesFunciones.cargarid_sucursalUbicacionBode || this.ubicacionbodeConstantesFunciones.event_dependid_sucursalUbicacionBode) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.ubicacionbode.getid_sucursal());
									//this.inicializarActualizarBindingUbicacionBode(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(ubicacionbode.getSucursal()!=null) {
							this.sucursalsForeignKey.add(ubicacionbode.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.ubicacionbode.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.ubicacionbodeConstantesFunciones.cargarid_bodegaUbicacionBode || this.ubicacionbodeConstantesFunciones.event_dependid_bodegaUbicacionBode) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.ubicacionbode.getid_bodega());
									//this.inicializarActualizarBindingUbicacionBode(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(ubicacionbode.getBodega()!=null) {
							this.bodegasForeignKey.add(ubicacionbode.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.ubicacionbode.getid_bodega(),false,"Formulario");

					//UbicacionBode
					if(!this.ubicacionbodeConstantesFunciones.cargarid_ubicacion_bodeUbicacionBode || this.ubicacionbodeConstantesFunciones.event_dependid_ubicacion_bodeUbicacionBode) {
						//this.cargarCombosUbicacionBodesForeignKeyLista(" where id="+this.ubicacionbode.getid_ubicacion_bode());
									//this.inicializarActualizarBindingUbicacionBode(false,false);
						this.ubicacionbodesForeignKey=new ArrayList<UbicacionBode>();

						if(ubicacionbode.getUbicacionBode()!=null) {
							this.ubicacionbodesForeignKey.add(ubicacionbode.getUbicacionBode());
						}

						this.addItemDefectoCombosForeignKeyUbicacionBode();
						this.cargarCombosFrameUbicacionBodesForeignKey("Todos");
					}
					this.setActualUbicacionBodeForeignKey(this.ubicacionbode.getid_ubicacion_bode(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUbicacionBode("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUbicacionBode(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUbicacionBode() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUbicacionBode(UbicacionBode ubicacionbode) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUbicacionBode(ubicacionbode,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUbicacionBode(UbicacionBode ubicacionbode,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUbicacionBode(ubicacionbode);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUbicacionBode(ubicacionbode,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUbicacionBode(ubicacionbode);
	}
	
	public void setVariablesObjetoActualToFormularioUbicacionBode(UbicacionBode ubicacionbode) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setText(ubicacionbode.getId().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setText(ubicacionbode.getnombre());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setText(ubicacionbode.getnivel().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setText(ubicacionbode.getorden().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UbicacionBode ubicacionbodeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ubicacionbodeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UbicacionBode ubicacionbodeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ubicacionbodeLocal=this.ubicacionbode;
			} else {
				ubicacionbodeLocal=this.ubicacionbodeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ubicacionbodeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUbicacionBode(ubicacionbodeLocal,true);
					
					if(ubicacionbodeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ubicacionbodeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ubicacionbodeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUbicacionBode(UbicacionBode ubicacionbode,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUbicacionBode(ubicacionbode,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(ubicacionbode);
	}
	
	public void setVariablesFormularioToObjetoActualUbicacionBode(UbicacionBode ubicacionbode,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUbicacionBode(ubicacionbode,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUbicacionBode(UbicacionBode ubicacionbode,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.getText()==null || this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.getText()=="" || this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.getText()=="Id") {
				this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setText("0");
			}

			if(conColumnasBase) {ubicacionbode.setId(Long.parseLong(this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UbicacionBodeConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelIdUbicacionBode,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ubicacionbode.setnombre(this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UbicacionBodeConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelnombreUbicacionBode,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ubicacionbode.setnivel(Integer.parseInt(this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UbicacionBodeConstantesFunciones.LABEL_NIVEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelnivelUbicacionBode,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ubicacionbode.setorden(Integer.parseInt(this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UbicacionBodeConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUbicacionBode.jLabelordenUbicacionBode,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUbicacionBode(UbicacionBode ubicacionbodeBean,UbicacionBode ubicacionbode,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ubicacionbodeBean.getid_bodega()!=null && !ubicacionbodeBean.getid_bodega().equals(-1L))) {ubicacionbode.setid_bodega(ubicacionbodeBean.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionbodeBean.getid_ubicacion_bode()!=null && !ubicacionbodeBean.getid_ubicacion_bode().equals(null))) {ubicacionbode.setid_ubicacion_bode(ubicacionbodeBean.getid_ubicacion_bode());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUbicacionBode(UbicacionBode ubicacionbodeOrigen,UbicacionBode ubicacionbode,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ubicacionbodeOrigen.getId()!=null && !ubicacionbodeOrigen.getId().equals(0L))) {ubicacionbode.setId(ubicacionbodeOrigen.getId());}}
			if(conDefault || (!conDefault && ubicacionbodeOrigen.getid_bodega()!=null && !ubicacionbodeOrigen.getid_bodega().equals(-1L))) {ubicacionbode.setid_bodega(ubicacionbodeOrigen.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionbodeOrigen.getid_ubicacion_bode()!=null && !ubicacionbodeOrigen.getid_ubicacion_bode().equals(null))) {ubicacionbode.setid_ubicacion_bode(ubicacionbodeOrigen.getid_ubicacion_bode());}
			if(conDefault || (!conDefault && ubicacionbodeOrigen.getnombre()!=null && !ubicacionbodeOrigen.getnombre().equals(""))) {ubicacionbode.setnombre(ubicacionbodeOrigen.getnombre());}
			if(conDefault || (!conDefault && ubicacionbodeOrigen.getnivel()!=null && !ubicacionbodeOrigen.getnivel().equals(0))) {ubicacionbode.setnivel(ubicacionbodeOrigen.getnivel());}
			if(conDefault || (!conDefault && ubicacionbodeOrigen.getorden()!=null && !ubicacionbodeOrigen.getorden().equals(0))) {ubicacionbode.setorden(ubicacionbodeOrigen.getorden());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUbicacionBode(UbicacionBode ubicacionbode) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setText(ubicacionbode.getId().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setText(ubicacionbode.getnombre());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setText(ubicacionbode.getnivel().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setText(ubicacionbode.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUbicacionBode(UbicacionBodeBean ubicacionbodeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setText(ubicacionbodeBean.getId().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setText(ubicacionbodeBean.getnombre());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setText(ubicacionbodeBean.getnivel().toString());
			this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setText(ubicacionbodeBean.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUbicacionBode(UbicacionBodeParameterReturnGeneral ubicacionbodeReturnGeneral,UbicacionBodeBean ubicacionbodeBean,Boolean conDefault) throws Exception { 
		try {
			UbicacionBode ubicacionbodeLocal=new UbicacionBode();
			
			ubicacionbodeLocal=ubicacionbodeReturnGeneral.getUbicacionBode();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ubicacionbodeLocal.getId()!=null && !ubicacionbodeLocal.getId().equals(0L))) {ubicacionbodeBean.setId(ubicacionbodeLocal.getId());}}
			if(conDefault || (!conDefault && ubicacionbodeLocal.getid_bodega()!=null && !ubicacionbodeLocal.getid_bodega().equals(-1L))) {ubicacionbodeBean.setid_bodega(ubicacionbodeLocal.getid_bodega());}
			if(conDefault || (!conDefault && ubicacionbodeLocal.getid_ubicacion_bode()!=null && !ubicacionbodeLocal.getid_ubicacion_bode().equals(null))) {ubicacionbodeBean.setid_ubicacion_bode(ubicacionbodeLocal.getid_ubicacion_bode());}
			if(conDefault || (!conDefault && ubicacionbodeLocal.getnombre()!=null && !ubicacionbodeLocal.getnombre().equals(""))) {ubicacionbodeBean.setnombre(ubicacionbodeLocal.getnombre());}
			if(conDefault || (!conDefault && ubicacionbodeLocal.getnivel()!=null && !ubicacionbodeLocal.getnivel().equals(0))) {ubicacionbodeBean.setnivel(ubicacionbodeLocal.getnivel());}
			if(conDefault || (!conDefault && ubicacionbodeLocal.getorden()!=null && !ubicacionbodeLocal.getorden().equals(0))) {ubicacionbodeBean.setorden(ubicacionbodeLocal.getorden());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUbicacionBodeGenerico(Long idUbicacionBodeSeleccionado,JComboBox jComboBoxUbicacionBode,List<UbicacionBode> ubicacionbodesLocal)throws Exception {
		try {
			UbicacionBode  ubicacionbodeTemp=null;

			for(UbicacionBode ubicacionbodeAux:ubicacionbodesLocal) {
				if(ubicacionbodeAux.getId()!=null && ubicacionbodeAux.getId().equals(idUbicacionBodeSeleccionado)) {
					ubicacionbodeTemp=ubicacionbodeAux;
					break;
				}
			}

			jComboBoxUbicacionBode.setSelectedItem(ubicacionbodeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUbicacionBodeGenerico(JComboBox jComboBoxUbicacionBode,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUbicacionBode.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUbicacionBode.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUbicacionBode.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUbicacionBode.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxUbicacionBode.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUbicacionBode.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
			
		if(sTipo.equals("UbicacionBode")) {
			jButtonUbicacionBodeActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("UbicacionProdu")) {
			jButtonUbicacionProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionbode=(UbicacionBode) ubicacionbodeLogic.getUbicacionBodes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ubicacionbode =(UbicacionBode) ubicacionbodes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ubicacionbode.getIsNew() && !ubicacionbode.getIsChanged() && !ubicacionbode.getIsDeleted()) {
				sDescripcion=ubicacionbode.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionbode.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ubicacionbode.getIsNew() && !ubicacionbode.getIsChanged() && !ubicacionbode.getIsDeleted()) {
				sDescripcion=ubicacionbode.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionbode.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!ubicacionbode.getIsNew() && !ubicacionbode.getIsChanged() && !ubicacionbode.getIsDeleted()) {
				sDescripcion=ubicacionbode.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionbode.getbodega_descripcion();
			}
		}

		if(sTipo.equals("UbicacionBode")) {
			//sDescripcion=this.getActualUbicacionBodeForeignKeyDescripcion((Long)value);
			if(!ubicacionbode.getIsNew() && !ubicacionbode.getIsChanged() && !ubicacionbode.getIsDeleted()) {
				sDescripcion=ubicacionbode.getubicacionbode_descripcion();
			} else {
				//sDescripcion=this.getActualUbicacionBodeForeignKeyDescripcion((Long)value);
				sDescripcion=ubicacionbode.getubicacionbode_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UbicacionBode ubicacionbodeRow=new UbicacionBode();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionbodeRow=(UbicacionBode) ubicacionbodeLogic.getUbicacionBodes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ubicacionbodeRow=(UbicacionBode) ubicacionbodes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonUbicacionBodeActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,UbicacionBode ubicacionbode) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUbicacionBode==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode = (UbicacionBode)this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.ubicacionbode = (UbicacionBode)this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(ubicacionbode!=null) {
						this.ubicacionbode = ubicacionbode;
					} else {
						this.ubicacionbode = new UbicacionBode();
					}
				}

				if(this.isTienePermisosUbicacionBode && this.permiteMantenimiento(this.ubicacionbode)) {
					UbicacionBodeBeanSwingJInternalFrame ubicacionbodeBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup=new UbicacionBodeBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ubicacionbodeBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup;
					} else {
						ubicacionbodeBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame;
					}

					List<UbicacionBode> ubicacionbodes=new ArrayList<UbicacionBode>();
					ubicacionbodes.add(this.ubicacionbode);
					if(!esRelacionado) {
						//ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setConGuardarRelaciones(false);
						//ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ubicacionbodeBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUbicacionBode.cargarUbicacionBodeBeanSwingJInternalFrame(ubicacionbodes,this.ubicacionbode,ubicacionbodeBeanSwingJInternalFrame,/*conInicializar,*/ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.getConGuardarRelaciones(),ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeSessionBean.getEsGuardarRelacionado());
					ubicacionbodeBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ubicacionbodeBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionBode("no_relacionado");

						ubicacionbodeBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UbicacionBodeConstantesFunciones.ITAMANIOFILATABLA + (UbicacionBodeConstantesFunciones.ITAMANIOFILATABLA/2));

						ubicacionbodeBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
						titledBorderUbicacionBode.setTitle(titledBorderUbicacionBode.getTitle() + " -> Ubicacion Bode");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ubicacionbodeBeanSwingJInternalFrame);
						}

						ubicacionbodeBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ubicacionbodeBeanSwingJInternalFrame);

						ubicacionbodeBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Ubicacion Bode",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonUbicacionProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,UbicacionBode ubicacionbode) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUbicacionBode==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode = (UbicacionBode)this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.ubicacionbode = (UbicacionBode)this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(ubicacionbode!=null) {
						this.ubicacionbode = ubicacionbode;
					} else {
						this.ubicacionbode = new UbicacionBode();
					}
				}

				if(this.isTienePermisosUbicacionProdu && this.permiteMantenimiento(this.ubicacionbode)) {
					UbicacionProduBeanSwingJInternalFrame ubicacionproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup=new UbicacionProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ubicacionproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup;
					} else {
						ubicacionproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame;
					}

					List<UbicacionBode> ubicacionbodes=new ArrayList<UbicacionBode>();
					ubicacionbodes.add(this.ubicacionbode);
					if(!esRelacionado) {
						//ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setConGuardarRelaciones(false);
						//ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ubicacionproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUbicacionBode.cargarUbicacionProduBeanSwingJInternalFrame(ubicacionbodes,this.ubicacionbode,ubicacionproduBeanSwingJInternalFrame,/*conInicializar,*/ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.getConGuardarRelaciones(),ubicacionproduBeanSwingJInternalFrame.ubicacionproduSessionBean.getEsGuardarRelacionado());
					ubicacionproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ubicacionproduBeanSwingJInternalFrame.actualizarEstadoPanelsUbicacionProdu("no_relacionado");

						ubicacionproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(UbicacionProduConstantesFunciones.ITAMANIOFILATABLA + (UbicacionProduConstantesFunciones.ITAMANIOFILATABLA/2));

						ubicacionproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
						TitledBorder titledBorderUbicacionProdu=(TitledBorder)ubicacionproduBeanSwingJInternalFrame.jScrollPanelDatosUbicacionProdu.getBorder();

						titledBorderUbicacionProdu.setTitle(titledBorderUbicacionBode.getTitle() + " -> Ubicacion Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ubicacionproduBeanSwingJInternalFrame);
						}

						ubicacionproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ubicacionproduBeanSwingJInternalFrame);

						ubicacionproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Ubicacion Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUbicacionBode(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode));			
			this.jButtonDuplicarUbicacionBode.setVisible((this.isVisibilidadCeldaDuplicarUbicacionBode && this.isPermisoDuplicarUbicacionBode));			
			this.jButtonCopiarUbicacionBode.setVisible((this.isVisibilidadCeldaCopiarUbicacionBode && this.isPermisoCopiarUbicacionBode));
			this.jButtonVerFormUbicacionBode.setVisible((this.isVisibilidadCeldaVerFormUbicacionBode && this.isPermisoVerFormUbicacionBode));
			
			this.jButtonAbrirOrderByUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));			
			
			this.jButtonNuevoRelacionesUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionBode && this.isPermisoNuevoUbicacionBode));			
			this.jButtonNuevoGuardarCambiosUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarUbicacionBode.setVisible((this.isVisibilidadCeldaModificarUbicacionBode && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.setVisible((this.isVisibilidadCeldaActualizarUbicacionBode && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.setVisible((this.isVisibilidadCeldaEliminarUbicacionBode && this.isPermisoEliminarUbicacionBode));
			this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.setVisible(this.isVisibilidadCeldaCancelarUbicacionBode);							
			this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));			
			
			}
						
			this.jButtonGuardarCambiosTablaUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode));						
			this.jButtonDuplicarToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaDuplicarUbicacionBode && this.isPermisoDuplicarUbicacionBode));						
			this.jButtonCopiarToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaCopiarUbicacionBode && this.isPermisoCopiarUbicacionBode));			
			this.jButtonVerFormToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaVerFormUbicacionBode && this.isPermisoVerFormUbicacionBode));			
			this.jButtonAbrirOrderByToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));
			this.jButtonNuevoRelacionesToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionBode && this.isPermisoNuevoUbicacionBode));			
			this.jButtonNuevoGuardarCambiosToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));			
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaModificarUbicacionBode && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaActualizarUbicacionBode  && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaEliminarUbicacionBode && this.isPermisoEliminarUbicacionBode));
			this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarToolBarUbicacionBode.setVisible(this.isVisibilidadCeldaCancelarUbicacionBode);				
			this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode));			
			this.jMenuItemDuplicarUbicacionBode.setVisible((this.isVisibilidadCeldaDuplicarUbicacionBode && this.isPermisoDuplicarUbicacionBode));			
			this.jMenuItemCopiarUbicacionBode.setVisible((this.isVisibilidadCeldaCopiarUbicacionBode && this.isPermisoCopiarUbicacionBode));			
			this.jMenuItemVerFormUbicacionBode.setVisible((this.isVisibilidadCeldaVerFormUbicacionBode && this.isPermisoVerFormUbicacionBode));			
			this.jMenuItemAbrirOrderByUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));			
			//this.jMenuItemMostrarOcultarUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));
			this.jMenuItemDetalleAbrirOrderByUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));			
			//this.jMenuItemDetalleMostrarOcultarUbicacionBode.setVisible((this.isVisibilidadCeldaOrdenUbicacionBode && this.isPermisoOrdenUbicacionBode));			
			this.jMenuItemNuevoRelacionesUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoRelacionesUbicacionBode && this.isPermisoNuevoUbicacionBode));			
			this.jMenuItemNuevoGuardarCambiosUbicacionBode.setVisible((this.isVisibilidadCeldaNuevoUbicacionBode && this.isPermisoNuevoUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));									
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemModificarUbicacionBode.setVisible((this.isVisibilidadCeldaModificarUbicacionBode && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemActualizarUbicacionBode.setVisible((this.isVisibilidadCeldaActualizarUbicacionBode && this.isPermisoActualizarUbicacionBode));	
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemEliminarUbicacionBode.setVisible((this.isVisibilidadCeldaEliminarUbicacionBode && this.isPermisoEliminarUbicacionBode));
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemCancelarUbicacionBode.setVisible(this.isVisibilidadCeldaCancelarUbicacionBode);				
			}
			
			this.jMenuItemGuardarCambiosUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));						
			this.jMenuItemGuardarCambiosTablaUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarCambiosUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUbicacionBode=this.jButtonNuevoUbicacionBode.isVisible();
			this.isVisibilidadCeldaDuplicarUbicacionBode=this.jButtonDuplicarUbicacionBode.isVisible();
			this.isVisibilidadCeldaCopiarUbicacionBode=this.jButtonCopiarUbicacionBode.isVisible();
			this.isVisibilidadCeldaVerFormUbicacionBode=this.jButtonVerFormUbicacionBode.isVisible();
			
			this.isVisibilidadCeldaOrdenUbicacionBode=this.jButtonAbrirOrderByUbicacionBode.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=this.jButtonNuevoRelacionesUbicacionBode.isVisible();
			this.isVisibilidadCeldaModificarUbicacionBode=this.jButtonModificarUbicacionBode.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.isVisibilidadCeldaActualizarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.isVisible();
			this.isVisibilidadCeldaGuardarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=this.jButtonGuardarCambiosTablaUbicacionBode.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUbicacionBode=this.jButtonNuevoToolBarUbicacionBode.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=this.jButtonNuevoRelacionesToolBarUbicacionBode.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.isVisibilidadCeldaModificarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarToolBarUbicacionBode.isVisible();
			this.isVisibilidadCeldaActualizarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarToolBarUbicacionBode.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarToolBarUbicacionBode.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarToolBarUbicacionBode.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUbicacionBode=this.jButtonGuardarCambiosToolBarUbicacionBode.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=this.jButtonGuardarCambiosTablaToolBarUbicacionBode.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUbicacionBode=this.jMenuItemNuevoUbicacionBode.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=this.jMenuItemNuevoRelacionesUbicacionBode.isVisible();
			
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.isVisibilidadCeldaModificarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jMenuItemModificarUbicacionBode.isVisible();
			this.isVisibilidadCeldaActualizarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jMenuItemActualizarUbicacionBode.isVisible();
			this.isVisibilidadCeldaEliminarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jMenuItemEliminarUbicacionBode.isVisible();
			this.isVisibilidadCeldaCancelarUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.jMenuItemCancelarUbicacionBode.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUbicacionBode=this.jMenuItemGuardarCambiosUbicacionBode.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=this.jMenuItemGuardarCambiosTablaUbicacionBode.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUbicacionBode(Boolean esInicializar) {
		if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
				//if(this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUbicacionBode();
			}
			
			this.inicializarActualizarBindingBotonesManualUbicacionBode(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUbicacionBode() {
		this.jButtonNuevoUbicacionBode.setVisible(this.isPermisoNuevoUbicacionBode);			
		this.jButtonDuplicarUbicacionBode.setVisible(this.isPermisoDuplicarUbicacionBode);			
		this.jButtonCopiarUbicacionBode.setVisible(this.isPermisoCopiarUbicacionBode);			
		this.jButtonVerFormUbicacionBode.setVisible(this.isPermisoVerFormUbicacionBode);			
		
		this.jButtonAbrirOrderByUbicacionBode.setVisible(this.isPermisoOrdenUbicacionBode);					
		
		this.jButtonNuevoRelacionesUbicacionBode.setVisible(this.isPermisoNuevoUbicacionBode);			
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarUbicacionBode.setVisible(this.isPermisoActualizarUbicacionBode);	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.setVisible(this.isPermisoActualizarUbicacionBode);	
			this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.setVisible(this.isPermisoEliminarUbicacionBode);
			this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.setVisible(this.isVisibilidadCeldaCancelarUbicacionBode);						
			this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.setVisible(this.isPermisoGuardarCambiosUbicacionBode);							
		}
		
		this.jButtonGuardarCambiosTablaUbicacionBode.setVisible(this.isPermisoActualizarUbicacionBode);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUbicacionBode() {
		this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarUbicacionBode.setVisible(this.isPermisoActualizarUbicacionBode);	
		this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.setVisible(this.isPermisoActualizarUbicacionBode);	
		this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.setVisible(this.isPermisoEliminarUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.setVisible(this.isVisibilidadCeldaCancelarUbicacionBode);							
		this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.setVisible((this.isVisibilidadCeldaGuardarUbicacionBode && this.isPermisoGuardarCambiosUbicacionBode));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUbicacionBode() {
		if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUbicacionBode();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUbicacionBode() {
	}
	
	public void jTableDatosUbicacionBodeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUbicacionBode(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ubicacionbode.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUbicacionBodeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUbicacionBode(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionBode.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionBode.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

				if(this.ubicacionbode.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ubicacionbode.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUbicacionBode.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ubicacionbode.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalUbicacionBodeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebUbicacionBode(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionBode.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionBode.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

				if(this.ubicacionbode.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ubicacionbode.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderUbicacionBode.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ubicacionbode.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaUbicacionBodeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebUbicacionBode(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionBode.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionBode.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

				if(this.ubicacionbode.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.ubicacionbode.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderUbicacionBode.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.ubicacionbode.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ubicacion_bodeUbicacionBodeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoubicacionbode=true;

			idTienePermisoubicacionbode=this.tienePermisosUsuarioEnPaginaWebUbicacionBode(UbicacionBodeConstantesFunciones.CLASSNAME);

			if(idTienePermisoubicacionbode) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUbicacionBode.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUbicacionBode.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);

				this.ubicacionbodeBeanSwingJInternalFrame=new UbicacionBodeBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ubicacionbodeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ubicacionbodeBeanSwingJInternalFrame.getUbicacionBodeLogic().setConnexion(this.ubicacionbodeLogic.getConnexion());

				if(this.ubicacionbode.getid_ubicacion_bode()!=null) {
					this.ubicacionbodeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ubicacionbodeBeanSwingJInternalFrame.setIdActual(this.ubicacionbode.getid_ubicacion_bode());
					this.ubicacionbodeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ubicacionbodeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ubicacionbodeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionBode();
				}

				JInternalFrameBase jinternalFrame =this.ubicacionbodeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUbicacionBode=(TitledBorder)this.jScrollPanelDatosUbicacionBode.getBorder();
				TitledBorder titledBorderubicacionbode=(TitledBorder)this.ubicacionbodeBeanSwingJInternalFrame.jScrollPanelDatosUbicacionBode.getBorder();

				titledBorderubicacionbode.setTitle(titledBorderUbicacionBode.getTitle() + " -> Ubicacion Bode");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ubicacion_bodeUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getid_ubicacion_bode()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ubicacion_bode = "+this.ubicacionbode.getid_ubicacion_bode().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.ubicacionbode.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnivelUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getnivel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nivel = "+this.ubicacionbode.getnivel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenUbicacionBodeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.getubicacionbode(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ubicacionbode==null) {
						this.ubicacionbode = new UbicacionBode();
					}

					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);
				}

				if(this.ubicacionbode.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.ubicacionbode.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUbicacionBode(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionBode(false,false);

			this.getUbicacionBodesFK_IdBodega();

			this.inicializarActualizarBindingUbicacionBode(false);

			//if(UbicacionBodeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionBode(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionBode(false,false);

			this.getUbicacionBodesFK_IdEmpresa();

			this.inicializarActualizarBindingUbicacionBode(false);

			//if(UbicacionBodeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionBode(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionBode(false,false);

			this.getUbicacionBodesFK_IdSucursal();

			this.inicializarActualizarBindingUbicacionBode(false);

			//if(UbicacionBodeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionBode(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUbicacionBodeUbicacionBodeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUbicacionBode(false,false);

			this.getUbicacionBodesFK_IdUbicacionBode();

			this.inicializarActualizarBindingUbicacionBode(false);

			//if(UbicacionBodeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUbicacionBode(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ubicacionbodeLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUbicacionBode() {
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
		

		if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
			this.jInternalFrameDetalleFormUbicacionBode.setVisible(false);	    			
			this.jInternalFrameDetalleFormUbicacionBode.dispose();
			this.jInternalFrameDetalleFormUbicacionBode=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
			this.jInternalFrameReporteDinamicoUbicacionBode.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUbicacionBode.dispose();
			this.jInternalFrameReporteDinamicoUbicacionBode=null;
		}
		
		if(this.jInternalFrameImportacionUbicacionBode!=null) {
			this.jInternalFrameImportacionUbicacionBode.setVisible(false);	    			
			this.jInternalFrameImportacionUbicacionBode.dispose();
			this.jInternalFrameImportacionUbicacionBode=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameUbicacionBode() {
		
		if(this.jInternalFrameTreeUbicacionBode!=null) {
			this.jInternalFrameTreeUbicacionBode.setVisible(false);	    			
			this.jInternalFrameTreeUbicacionBode.dispose();
			this.jInternalFrameTreeUbicacionBode=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUbicacionBode();
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			
			if(sTipo.equals("NuevoUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUbicacionBode")) {
				jButtonDuplicarUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUbicacionBode")) {
				jButtonCopiarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("VerFormUbicacionBode")) {
				jButtonVerFormUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUbicacionBode")) {
				jButtonDuplicarUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUbicacionBode")) {
				jButtonDuplicarUbicacionBodeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUbicacionBode")) {
				jButtonModificarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUbicacionBode")) {
				jButtonModificarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUbicacionBode")) {
				jButtonModificarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUbicacionBode")) {
				jButtonActualizarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUbicacionBode")) {
				jButtonActualizarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUbicacionBode")) {
				jButtonActualizarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("EliminarUbicacionBode")) {
				jButtonEliminarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUbicacionBode")) {
				jButtonEliminarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUbicacionBode")) {
				jButtonEliminarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("CancelarUbicacionBode")) {
				jButtonCancelarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUbicacionBode")) {
				jButtonCancelarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUbicacionBode")) {
				jButtonCancelarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("CerrarUbicacionBode")) {
				jButtonCerrarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUbicacionBode")) {
				jButtonCerrarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUbicacionBode")) {
				jButtonCerrarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUbicacionBode")) {
				jButtonMostrarOcultarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUbicacionBode")) {
				jButtonCancelarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUbicacionBode")) {
				jButtonCopiarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUbicacionBode")) {
				jButtonVerFormUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUbicacionBode")) {
				jButtonCopiarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUbicacionBode")) {
				jButtonVerFormUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUbicacionBode")) {
				jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUbicacionBode")) {
				jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUbicacionBode")) {
				jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolUbicacionBode")) {
				jButtonArbolUbicacionBodeActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresUbicacionBode")) {
				jButtonAnterioresUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUbicacionBode")) {
				jButtonAnterioresUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUbicacionBode")) {
				jButtonAnterioresUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUbicacionBode")) {
				jButtonSiguientesUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUbicacionBode")) {
				jButtonSiguientesUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUbicacionBode")) {
				jButtonSiguientesUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUbicacionBode") || sTipo.equals("MenuItemDetalleAbrirOrderByUbicacionBode")) {
				jButtonAbrirOrderByUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUbicacionBode") || sTipo.equals("MenuItemDetalleMostrarOcultarUbicacionBode")) {
				jButtonMostrarOcultarUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUbicacionBode")) {
				jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUbicacionBode")) {
				jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUbicacionBode")) {
				jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUbicacionBode")) {
				jButtonCerrarReporteDinamicoUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUbicacionBode")) {
				jButtonGenerarReporteDinamicoUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUbicacionBode")) {
				
				jButtonGenerarExcelReporteDinamicoUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUbicacionBode")) {
				jButtonCerrarImportacionUbicacionBodeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUbicacionBode")) {
				
				jButtonGenerarImportacionUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUbicacionBode")) {
				
				jButtonAbrirImportacionUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUbicacionBode")) {
				jComboBoxTiposAccionesUbicacionBodeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUbicacionBode")) {
				jComboBoxTiposRelacionesUbicacionBodeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUbicacionBode")) {
				jComboBoxTiposAccionesUbicacionBodeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUbicacionBode")) {
				
				jComboBoxTiposSeleccionarUbicacionBodeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUbicacionBode")) {
				jTextFieldValorCampoGeneralUbicacionBodeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUbicacionBode")) {
				jButtonAbrirOrderByUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUbicacionBode")) {
				jButtonAbrirOrderByUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUbicacionBode")) {
				jButtonCerrarOrderByUbicacionBodeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUbicacionBodeBusqueda")) {
				this.jButtonidUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUbicacionBodeUpdate")) {
				this.jButtonid_empresaUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUbicacionBodeBusqueda")) {
				this.jButtonid_empresaUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUbicacionBodeUpdate")) {
				this.jButtonid_sucursalUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUbicacionBodeBusqueda")) {
				this.jButtonid_sucursalUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUbicacionBodeUpdate")) {
				this.jButtonid_bodegaUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUbicacionBodeBusqueda")) {
				this.jButtonid_bodegaUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionBodeUpdate")) {
				this.jButtonid_ubicacion_bodeUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionBodeBusqueda")) {
				this.jButtonid_ubicacion_bodeUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreUbicacionBodeBusqueda")) {
				this.jButtonnombreUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelUbicacionBodeBusqueda")) {
				this.jButtonnivelUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUbicacionBodeBusqueda")) {
				this.jButtonordenUbicacionBodeBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaUbicacionBode")) {
				this.jButtonFK_IdBodegaUbicacionBodeActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUbicacionBodeUbicacionBode")) {
				this.jButtonFK_IdUbicacionBodeUbicacionBodeActionPerformed(evt);
			}
			
			;
			
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUbicacionBode();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UbicacionBode ubicacionbodeLocal=null;
			
			if(!this.getEsControlTabla()) {
				ubicacionbodeLocal=this.ubicacionbode;
			} else {
				ubicacionbodeLocal=this.ubicacionbodeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
							
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
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
			
			


			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
								
						
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
								
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
							
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
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
			
			


			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
								
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUbicacionBode")) {
					jCheckBoxSeleccionarTodosUbicacionBodeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUbicacionBode")) {
					jCheckBoxSeleccionadosUbicacionBodeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUbicacionBode")) {
					
				}
				
				


				
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
												
				
				


				
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
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
			
			


			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUbicacionBodeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ubicacionbode);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ubicacionbode);
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
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
				
				


				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UbicacionBode.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UbicacionBode.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUbicacionBodeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ubicacionbodeAnterior =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUbicacionBode")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUbicacionBodeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUbicacionBode.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ubicacionbode =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ubicacionbode =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ubicacionbode);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUbicacionBode")) {
				
				}
				
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUbicacionBode")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUbicacionBode.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUbicacionBode")) {
			
			}
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUbicacionBode();
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			if(sTipo.equals("NuevoUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUbicacionBode")) {
				jButtonDuplicarUbicacionBodeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUbicacionBode")) {
				jButtonCopiarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUbicacionBode")) {
				jButtonVerFormUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUbicacionBode")) {
				jButtonNuevoUbicacionBodeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUbicacionBode")) {
				jButtonModificarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUbicacionBode")) {
				jButtonActualizarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUbicacionBode")) {
				jButtonEliminarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUbicacionBode")) {
				jButtonCancelarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUbicacionBode")) {
				jButtonCerrarUbicacionBodeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUbicacionBode")) {
				jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUbicacionBode")) {
				jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUbicacionBode")) {
				jButtonAbrirOrderByUbicacionBodeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUbicacionBode")) {
				jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUbicacionBode")) {
				jButtonAnterioresUbicacionBodeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUbicacionBode")) {
				jButtonSiguientesUbicacionBodeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUbicacionBodeBusqueda")) {
				this.jButtonidUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUbicacionBodeUpdate")) {
				this.jButtonid_empresaUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUbicacionBodeBusqueda")) {
				this.jButtonid_empresaUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUbicacionBodeUpdate")) {
				this.jButtonid_sucursalUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUbicacionBodeBusqueda")) {
				this.jButtonid_sucursalUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaUbicacionBodeUpdate")) {
				this.jButtonid_bodegaUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaUbicacionBodeBusqueda")) {
				this.jButtonid_bodegaUbicacionBodeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionBodeUpdate")) {
				this.jButtonid_ubicacion_bodeUbicacionBodeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ubicacion_bodeUbicacionBodeBusqueda")) {
				this.jButtonid_ubicacion_bodeUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreUbicacionBodeBusqueda")) {
				this.jButtonnombreUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelUbicacionBodeBusqueda")) {
				this.jButtonnivelUbicacionBodeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUbicacionBodeBusqueda")) {
				this.jButtonordenUbicacionBodeBusquedaActionPerformed(evt);
			}
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUbicacionBode();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUbicacionBode")) {
				closingInternalFrameUbicacionBode();
				
			} else if(sTipo.equals("jButtonCancelarUbicacionBode")) {
				JInternalFrameBase jInternalFrameDetalleFormUbicacionBode = (JInternalFrameBase)evt.getSource();
	            	
	            UbicacionBodeBeanSwingJInternalFrame jInternalFrameParent=(UbicacionBodeBeanSwingJInternalFrame)jInternalFrameDetalleFormUbicacionBode.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUbicacionBodeActionPerformed(null);
			}
			
			UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ubicacionbode,new Object(),this.ubicacionbodeParameterGeneral,this.ubicacionbodeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUbicacionBode(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUbicacionBode(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUbicacionBode(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ubicacionbode)) {
			if(!esControlTabla) {
				if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);			
				}
				
				if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUbicacionBode(this.ubicacionbode,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ubicacionbodeReturnGeneral=ubicacionbodeLogic.procesarEventosUbicacionBodesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionbodeLogic.getUbicacionBodes(),this.ubicacionbode,this.ubicacionbodeParameterGeneral,this.isEsNuevoUbicacionBode,classes);//this.ubicacionbodeLogic.getUbicacionBode()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUbicacionBode(this.ubicacionbodeReturnGeneral,this.ubicacionbodeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUbicacionBode(classes,this.ubicacionbodeReturnGeneral,this.ubicacionbodeBean,false);
					}
						
					if(this.ubicacionbodeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode());	
					}
						
					if(this.ubicacionbodeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode(),classes);//this.ubicacionbodeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUbicacionBode(this.ubicacionbode,classes);//this.ubicacionbodeBean);									
				}
			
				if(UbicacionBodeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUbicacionBode(this.ubicacionbode,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUbicacionBode(this.ubicacionbode);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ubicacionbodeAnterior!=null) {
						this.ubicacionbode=this.ubicacionbodeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ubicacionbodeReturnGeneral=ubicacionbodeLogic.procesarEventosUbicacionBodesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionbodeLogic.getUbicacionBodes(),this.ubicacionbode,this.ubicacionbodeParameterGeneral,this.isEsNuevoUbicacionBode,classes);//this.ubicacionbodeLogic.getUbicacionBode()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ubicacionbodeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ubicacionbodeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ubicacionbodeReturnGeneral.getUbicacionBode(),ubicacionbodeLogic.getUbicacionBodes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ubicacionbodeReturnGeneral.getUbicacionBode(),this.ubicacionbodes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUbicacionBode.repaint();
				
				//((AbstractTableModel) this.jTableDatosUbicacionBode.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUbicacionBode();
			}
		}
	}
	
	public void actualizarVisualTableDatosUbicacionBode() throws Exception {
		
		UbicacionBodeModel ubicacionbodeModel=(UbicacionBodeModel)this.jTableDatosUbicacionBode.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ubicacionbodeModel.ubicacionbodes=this.ubicacionbodeLogic.getUbicacionBodes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ubicacionbodeModel.ubicacionbodes=this.ubicacionbodes;
		}
		
		
		((UbicacionBodeModel) this.jTableDatosUbicacionBode.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUbicacionBode() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getubicacionbodeAnterior(),this.ubicacionbodeLogic.getUbicacionBodes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getubicacionbodeAnterior(),this.ubicacionbodes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUbicacionBode();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUbicacionBode(UbicacionBode ubicacionbode,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionBode.class)) {
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.setUbicacionBodes(ubicacionbode.getUbicacionBodes());
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionBode(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionProdu.class)) {
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.setUbicacionProdus(ubicacionbode.getUbicacionProdus());
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
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
										
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionbode,new Object(),generalEntityParameterGeneral,this.ubicacionbodeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ubicacionbodeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UbicacionBodeConstantesFunciones.getClassesRelationshipsOfUbicacionBode(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UbicacionBodeConstantesFunciones.getClassesRelationshipsFromStringsOfUbicacionBode(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUbicacionBode(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UbicacionBodeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ubicacionbode,new Object(),generalEntityParameterGeneral,this.ubicacionbodeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUbicacionBode(UbicacionBodeBean ubicacionbodeBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionBode.class)) {
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.setUbicacionBodes(ubicacionbode.getUbicacionBodes());
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionBode(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionProdu.class)) {
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.setUbicacionProdus(ubicacionbode.getUbicacionProdus());
					this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaUbicacionProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUbicacionBode(ArrayList<Classe> classes,UbicacionBodeReturnGeneral ubicacionbodeReturnGeneral,UbicacionBodeBean ubicacionbodeBean,Boolean conDefault) throws Exception {
		
			this.ubicacionbodeBean.setUbicacionBodes(ubicacionbodeReturnGeneral.getUbicacionBode().getUbicacionBodes());
			this.ubicacionbodeBean.setUbicacionProdus(ubicacionbodeReturnGeneral.getUbicacionBode().getUbicacionProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUbicacionBode(UbicacionBode ubicacionbode,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionBode.class)) {
					ubicacionbode.setUbicacionBodes(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeBeanSwingJInternalFrame.ubicacionbodeLogic.getUbicacionBodes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(UbicacionProdu.class)) {
					ubicacionbode.setUbicacionProdus(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduBeanSwingJInternalFrame.ubicacionproduLogic.getUbicacionProdus());
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
		if(!paraTabla && !this.permiteMantenimiento(this.ubicacionbode)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUbicacionBode = new UbicacionBodeDetalleFormJInternalFrame(jDesktopPane,this.ubicacionbodeSessionBean.getConGuardarRelaciones(),this.ubicacionbodeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.setVisible(false);
		this.jInternalFrameDetalleFormUbicacionBode.setSelected(false);						
		
		this.jInternalFrameDetalleFormUbicacionBode.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeLogic=this.ubicacionbodeLogic;
		
		this.cargarCombosFrameForeignKeyUbicacionBode("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUbicacionBode();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUbicacionBode();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUbicacionBode("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUbicacionBode();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUbicacionBode.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUbicacionBode"));
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarUbicacionBode.addActionListener(new ButtonActionListener(this,"ModificarUbicacionBode"));

		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"ModificarToolBarUbicacionBode"));
					
		this.jInternalFrameDetalleFormUbicacionBode.jMenuItemModificarUbicacionBode.addActionListener(new ButtonActionListener(this,"MenuItemModificarUbicacionBode"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.addActionListener (new ButtonActionListener(this,"ActualizarUbicacionBode"));
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUbicacionBode"));
						
		this.jInternalFrameDetalleFormUbicacionBode.jMenuItemActualizarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUbicacionBode"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.addActionListener (new ButtonActionListener(this,"EliminarUbicacionBode"));
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"EliminarToolBarUbicacionBode"));
								
		this.jInternalFrameDetalleFormUbicacionBode.jMenuItemEliminarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUbicacionBode"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.addActionListener (new ButtonActionListener(this,"CancelarUbicacionBode"));
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"CancelarToolBarUbicacionBode"));
					
		this.jInternalFrameDetalleFormUbicacionBode.jMenuItemCancelarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUbicacionBode"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jMenuItemDetalleCerrarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUbicacionBode"));		
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionBode"));
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionBode"));
		
		
		
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUbicacionBode"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonidUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnombreUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nombreUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnivelUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nivelUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonordenUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"ordenUbicacionBodeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUbicacionBode"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUbicacionBode"));
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUbicacionBode"));
		}
		
		this.jTableDatosUbicacionBode.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUbicacionBode"));
		
		this.jTableDatosUbicacionBode.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUbicacionBode"));
		
		this.jButtonNuevoUbicacionBode.addActionListener(new ButtonActionListener(this,"NuevoUbicacionBode"));
		
		this.jButtonDuplicarUbicacionBode.addActionListener(new ButtonActionListener(this,"DuplicarUbicacionBode"));
		
		this.jButtonCopiarUbicacionBode.addActionListener(new ButtonActionListener(this,"CopiarUbicacionBode"));
		
		this.jButtonVerFormUbicacionBode.addActionListener(new ButtonActionListener(this,"VerFormUbicacionBode"));
		
		
		this.jButtonNuevoToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"NuevoToolBarUbicacionBode"));
			
		this.jButtonDuplicarToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUbicacionBode"));
			
		this.jMenuItemNuevoUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUbicacionBode"));
			
		this.jMenuItemDuplicarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUbicacionBode"));		
		
		
		this.jButtonNuevoRelacionesUbicacionBode.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUbicacionBode"));
		
		
		this.jButtonNuevoRelacionesToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUbicacionBode"));
			
		this.jMenuItemNuevoRelacionesUbicacionBode.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUbicacionBode"));		
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarUbicacionBode.addActionListener(new ButtonActionListener(this,"ModificarUbicacionBode"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonModificarToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"ModificarToolBarUbicacionBode"));
			
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemModificarUbicacionBode.addActionListener(new ButtonActionListener(this,"MenuItemModificarUbicacionBode"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarUbicacionBode.addActionListener (new ButtonActionListener(this,"ActualizarUbicacionBode"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonActualizarToolBarUbicacionBode.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUbicacionBode"));
				
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemActualizarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUbicacionBode"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarUbicacionBode.addActionListener (new ButtonActionListener(this,"EliminarUbicacionBode"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonEliminarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"EliminarToolBarUbicacionBode"));
						
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemEliminarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUbicacionBode"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarUbicacionBode.addActionListener (new ButtonActionListener(this,"CancelarUbicacionBode"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonCancelarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"CancelarToolBarUbicacionBode"));
			
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemCancelarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUbicacionBode"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUbicacionBode"));		
		
		
		this.jButtonCerrarUbicacionBode.addActionListener (new ButtonActionListener(this,"CerrarUbicacionBode"));
		
		
		this.jButtonCerrarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"CerrarToolBarUbicacionBode"));
			
		this.jMenuItemCerrarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUbicacionBode"));
			
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jMenuItemDetalleCerrarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUbicacionBode"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosUbicacionBode"));
		}
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUbicacionBode"));
		}
		
		this.jButtonCopiarToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"CopiarToolBarUbicacionBode"));
			
		this.jButtonVerFormToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"VerFormToolBarUbicacionBode"));
		
		this.jMenuItemGuardarCambiosUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUbicacionBode"));
			
		this.jMenuItemCopiarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUbicacionBode"));		
		
		this.jMenuItemVerFormUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUbicacionBode"));		
		
		
		this.jButtonGuardarCambiosTablaUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUbicacionBode"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUbicacionBode"));
			
		this.jMenuItemGuardarCambiosTablaUbicacionBode.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUbicacionBode"));		
		
		
		
		this.jButtonRecargarInformacionUbicacionBode.addActionListener (new ButtonActionListener(this,"RecargarInformacionUbicacionBode"));
					
		this.jButtonRecargarInformacionToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUbicacionBode"));
		
		this.jMenuItemRecargarInformacionUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUbicacionBode"));		
		
		
		this.jButtonArbolUbicacionBode.addActionListener (new ButtonActionListener(this,"ArbolUbicacionBode"));
		
		this.jButtonAnterioresUbicacionBode.addActionListener (new ButtonActionListener(this,"AnterioresUbicacionBode"));
		
		
		this.jButtonAnterioresToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUbicacionBode"));
		
		this.jMenuItemAnterioresUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUbicacionBode"));		
		
		
		this.jButtonSiguientesUbicacionBode.addActionListener (new ButtonActionListener(this,"SiguientesUbicacionBode"));
		
		
		this.jButtonSiguientesToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUbicacionBode"));
			
		this.jMenuItemSiguientesUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUbicacionBode"));
			
		this.jMenuItemAbrirOrderByUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUbicacionBode"));
			
		this.jMenuItemMostrarOcultarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUbicacionBode"));
			
		this.jMenuItemDetalleAbrirOrderByUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUbicacionBode"));
			
		this.jMenuItemDetalleMostarOcultarUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUbicacionBode"));		
		
		
		this.jButtonNuevoGuardarCambiosUbicacionBode.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUbicacionBode"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUbicacionBode"));
			
		this.jMenuItemNuevoGuardarCambiosUbicacionBode.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUbicacionBode"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUbicacionBode.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUbicacionBode"));

		this.jCheckBoxSeleccionadosUbicacionBode.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUbicacionBode"));
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUbicacionBode"));
		}
		
		
		this.jComboBoxTiposRelacionesUbicacionBode.addActionListener (new ButtonActionListener(this,"TiposRelacionesUbicacionBode"));
			
		this.jComboBoxTiposAccionesUbicacionBode.addActionListener (new ButtonActionListener(this,"TiposAccionesUbicacionBode"));
					
		this.jComboBoxTiposSeleccionarUbicacionBode.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUbicacionBode"));
			
		this.jTextFieldValorCampoGeneralUbicacionBode.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUbicacionBode"));		
		
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonidUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnombreUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nombreUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnivelUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nivelUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonordenUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"ordenUbicacionBodeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaUbicacionBode.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUbicacionBode"));

			this.jButtonFK_IdUbicacionBodeUbicacionBode.addActionListener(new ButtonActionListener(this,"FK_IdUbicacionBodeUbicacionBode"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUbicacionBode!=null) {
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionBode"));
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionBode"));
				this.jInternalFrameReporteDinamicoUbicacionBode.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionBode"));
			}
			
			//this.jButtonCerrarReporteDinamicoUbicacionBode.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUbicacionBode"));				
			//this.jButtonGenerarReporteDinamicoUbicacionBode.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUbicacionBode"));
			//this.jButtonGenerarExcelReporteDinamicoUbicacionBode.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUbicacionBode"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUbicacionBode!=null) {
				this.jInternalFrameImportacionUbicacionBode.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUbicacionBode"));
				this.jInternalFrameImportacionUbicacionBode.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUbicacionBode"));
				this.jInternalFrameImportacionUbicacionBode.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUbicacionBode"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUbicacionBode.addActionListener (new ButtonActionListener(this,"AbrirOrderByUbicacionBode"));
			
			this.jButtonAbrirOrderByToolBarUbicacionBode.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUbicacionBode"));			
			
			if(this.jInternalFrameOrderByUbicacionBode!=null) {
				this.jInternalFrameOrderByUbicacionBode.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUbicacionBode"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUbicacionBode.jTabbedPaneRelacionesUbicacionBode.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUbicacionBode"));
		
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
            		closingInternalFrameUbicacionBode();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUbicacionBode.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUbicacionBode = (JInternalFrameBase)event.getSource();
	            	
	            UbicacionBodeBeanSwingJInternalFrame jInternalFrameParent=(UbicacionBodeBeanSwingJInternalFrame)jInternalFrameDetalleFormUbicacionBode.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUbicacionBodeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUbicacionBode.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUbicacionBodeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUbicacionBode.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUbicacionBode.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUbicacionBode";
		inputMap = this.jButtonNuevoUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUbicacionBodeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUbicacionBodeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUbicacionBode";
		inputMap = this.jButtonNuevoRelacionesUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUbicacionBodeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUbicacionBode";
		inputMap = this.jButtonModificarUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUbicacionBode";
		inputMap = this.jButtonActualizarUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUbicacionBode";
		inputMap = this.jButtonEliminarUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUbicacionBode";
		inputMap = this.jButtonCancelarUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUbicacionBode";
		inputMap = this.jButtonCerrarUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUbicacionBode";
		inputMap = this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUbicacionBode.jButtonGuardarCambiosUbicacionBode.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUbicacionBodeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUbicacionBode.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUbicacionBodeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUbicacionBode.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUbicacionBodeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUbicacionBode.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUbicacionBodeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUbicacionBode.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUbicacionBodeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonidUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"idUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_empresaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_sucursalUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_bodegaUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaUbicacionBodeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeUpdate.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonid_ubicacion_bodeUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"id_ubicacion_bodeUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnombreUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nombreUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonnivelUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"nivelUbicacionBodeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUbicacionBode.jButtonordenUbicacionBodeBusqueda.addActionListener(new ButtonActionListener(this,"ordenUbicacionBodeBusqueda"));
		
		
		this.jButtonFK_IdBodegaUbicacionBode.addActionListener(new ButtonActionListener(this,"FK_IdBodegaUbicacionBode"));

		this.jButtonFK_IdUbicacionBodeUbicacionBode.addActionListener(new ButtonActionListener(this,"FK_IdUbicacionBodeUbicacionBode"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUbicacionBode.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUbicacionBodeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUbicacionBodeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUbicacionBode.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUbicacionBode(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
					ubicacionbodeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionBode ubicacionbodeAux:ubicacionbodes) {
					ubicacionbodeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUbicacionBodeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
						ubicacionbodeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionBode ubicacionbodeAux:ubicacionbodes) {
						ubicacionbodeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionBode ubicacionbodeAux:ubicacionbodes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUbicacionBode(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUbicacionBode.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUbicacionBode.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUbicacionBodeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUbicacionBode.getSelectedRows();
			
			UbicacionBode ubicacionbodeLocal=new UbicacionBode();
			
			//this.seleccionarTodosUbicacionBode(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ubicacionbodeLocal =(UbicacionBode) this.ubicacionbodeLogic.getUbicacionBodes().toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ubicacionbodeLocal =(UbicacionBode) this.ubicacionbodes.toArray()[this.jTableDatosUbicacionBode.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ubicacionbodeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
						ubicacionbodeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UbicacionBode ubicacionbodeAux:ubicacionbodes) {
						ubicacionbodeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUbicacionBode(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUbicacionBode.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUbicacionBode.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUbicacionBode,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUbicacionBodeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUbicacionBodeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUbicacionBodeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUbicacionBode.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UbicacionBode ubicacionbodeAux:this.ubicacionbodeLogic.getUbicacionBodes()) {
				
						if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ubicacionbodeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							ubicacionbodeAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							ubicacionbodeAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionBode ubicacionbodeAux:ubicacionbodes) {
					
						if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ubicacionbodeAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							ubicacionbodeAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							ubicacionbodeAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUbicacionBode(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUbicacionBodeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUbicacionBode=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUbicacionBode.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUbicacionBode) {				
					conSplash=true;//false;										
					
					//this.startProcessUbicacionBode(conSplash);
				
					this.generarReporteUbicacionBodesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUbicacionBodesSeleccionados();
				//this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUbicacionBodesSeleccionados(false);
				//this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUbicacionBodesSeleccionados(true);
				//this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUbicacionBode();
				
				this.exportarUbicacionBodesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUbicacionBodes();
				//this.importarUbicacionBodes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUbicacionBode();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUbicacionBodesSeleccionados();
				//this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ubicacion Bode", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUbicacionBode();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUbicacionBode)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUbicacionBode(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
				}	
			} 			
			else if(UbicacionBodeBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUbicacionBode) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUbicacionBode(conSplash);
					
						//this.actualizarParametrosGeneralUbicacionBode();
						
						this.generarReporteProcesoAccionUbicacionBodesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UbicacionBodeBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ubicacion BodeS SELECCIONADOS?", "MANTENIMIENTO DE Ubicacion Bode", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUbicacionBode();
				
						this.actualizarParametrosGeneralUbicacionBode();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ubicacionbodeReturnGeneral=ubicacionbodeLogic.procesarAccionUbicacionBodesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ubicacionbodeLogic.getUbicacionBodes(),this.ubicacionbodeParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUbicacionBodeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUbicacionBode();
					
					UbicacionBodeBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUbicacionBodeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUbicacionBode.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUbicacionBode.jComboBoxTiposAccionesFormularioUbicacionBode.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUbicacionBode(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUbicacionBodeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUbicacionBode();
			
			if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
			UbicacionBode ubicacionbode=new UbicacionBode();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUbicacionBode(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUbicacionBode.getSelectedItem();
			
			
			
			
			ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
			//this.sTipoAccion;
			
			if(ubicacionbodesSeleccionados.size()==1) {
				for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
					ubicacionbode=ubicacionbodeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Ubicacion Bode")) {
					jButtonUbicacionBodeActionPerformed(null,rowIndex,true,false,ubicacionbode);
				}
				else if(this.sTipoRelacion.equals("Ubicacion Producto")) {
					jButtonUbicacionProduActionPerformed(null,rowIndex,true,false,ubicacionbode);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUbicacionBode();
			
      		//this.finishProcessUbicacionBode(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUbicacionBodeReturnGeneral() throws Exception {
		if(this.ubicacionbodeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ubicacionbodeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ubicacionbodeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ubicacionbodeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ubicacionbodeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ubicacionbodeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUbicacionBode(false);
		}
		
		if(this.ubicacionbodeReturnGeneral.getConRetornoLista() || this.ubicacionbodeReturnGeneral.getConRetornoObjeto()) {
			if(this.ubicacionbodeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ubicacionbodeLogic.setUbicacionBodes(this.ubicacionbodeReturnGeneral.getUbicacionBodes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ubicacionbodeReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ubicacionbodeLogic.setUbicacionBode(this.ubicacionbodeReturnGeneral.getUbicacionBode());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUbicacionBode(false);
		}
	}
	
	public void actualizarParametrosGeneralUbicacionBode() throws Exception {
		
		
	}
	
	public ArrayList<UbicacionBode> getUbicacionBodesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUbicacionBode) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UbicacionBode ubicacionbodeAux:ubicacionbodeLogic.getUbicacionBodes()) {
					if(ubicacionbodeAux.getIsSelected()) {
						ubicacionbodesSeleccionados.add(ubicacionbodeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UbicacionBode ubicacionbodeAux:this.ubicacionbodes) {
					if(ubicacionbodeAux.getIsSelected()) {
						ubicacionbodesSeleccionados.add(ubicacionbodeAux);				
					}
				}
			}
			
			if(ubicacionbodesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ubicacionbodesSeleccionados.addAll(this.ubicacionbodeLogic.getUbicacionBodes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ubicacionbodesSeleccionados.addAll(this.ubicacionbodes);				
					}
				}
			}
		} else {
			ubicacionbodesSeleccionados.add(this.ubicacionbode);
		}
		
		return ubicacionbodesSeleccionados;
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
	
	public void generarReporteUbicacionBodesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUbicacionBodesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUbicacionBodesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUbicacionBodesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUbicacionBodesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesUbicacionBodesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ubicacion Bode",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados);
		
	}	
	
	public void generarReporteNormalUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUbicacionBodesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUbicacionBode();
		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUbicacionBode();
		
		
		//this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados ,ubicacionbodeImplementable,ubicacionbodeImplementableHome);
	}
	
	public void mostrarImportacionUbicacionBodes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUbicacionBode();
		
		this.abrirFrameImportacionUbicacionBode();		
		
			
		//this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados ,ubicacionbodeImplementable,ubicacionbodeImplementableHome);
	}
	
	public void importarUbicacionBodes() throws Exception {		
	
	}
	
	public void exportarUbicacionBodesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUbicacionBodesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUbicacionBodesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUbicacionBodesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ubicacion Bode",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUbicacionBode(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUbicacionBode(ubicacionbodeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ubicacionbodeAux.setsDetalleGeneralEntityReporte(ubicacionbodeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUbicacionBode(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_NIVEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UbicacionBodeConstantesFunciones.LABEL_ORDEN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUbicacionBode(UbicacionBode ubicacionbode,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ubicacionbode.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getubicacionbode_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getnivel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ubicacionbode.getorden().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UbicacionBodes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUbicacionBode(row);				
				iRow++;
			}				
			
			for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUbicacionBode(ubicacionbodeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUbicacionBodesSeleccionados() throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();		
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ubicacionbode.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ubicacionbodes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ubicacionbode");
			//elementRoot.appendChild(element);
		
			for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
				element = document.createElement("ubicacionbode");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUbicacionBode(ubicacionbodeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ubicacion Bode",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUbicacionBode(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_NIVEL);
		cell = row.createCell(iColumn++);cell.setCellValue(UbicacionBodeConstantesFunciones.LABEL_ORDEN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUbicacionBode(UbicacionBode ubicacionbode,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getubicacionbode_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getnivel());
		cell = row.createCell(iColumn++);cell.setCellValue(ubicacionbode.getorden());				
	}
	
	public void setFilaDatosExportarXmlUbicacionBode(UbicacionBode ubicacionbode,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UbicacionBodeConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ubicacionbode.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UbicacionBodeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ubicacionbode.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UbicacionBodeConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ubicacionbode.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(UbicacionBodeConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ubicacionbode.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(UbicacionBodeConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(ubicacionbode.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementubicacionbode_descripcion = document.createElement(UbicacionBodeConstantesFunciones.IDUBICACIONBODE);
		elementubicacionbode_descripcion.appendChild(document.createTextNode(ubicacionbode.getubicacionbode_descripcion()));
		element.appendChild(elementubicacionbode_descripcion);

		Element elementnombre = document.createElement(UbicacionBodeConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(ubicacionbode.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnivel = document.createElement(UbicacionBodeConstantesFunciones.NIVEL);
		elementnivel.appendChild(document.createTextNode(ubicacionbode.getnivel().toString().trim()));
		element.appendChild(elementnivel);

		Element elementorden = document.createElement(UbicacionBodeConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(ubicacionbode.getorden().toString().trim()));
		element.appendChild(elementorden);
	}
	
	public void generarReporteGroupGenericoUbicacionBodesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UbicacionBode> ubicacionbodesSeleccionados=new ArrayList<UbicacionBode>();
		
		ubicacionbodesSeleccionados=this.getUbicacionBodesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUbicacionBode(ubicacionbodesSeleccionados);
		
		this.generarReporteUbicacionBodes("Todos",ubicacionbodesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUbicacionBode(ArrayList<UbicacionBode> ubicacionbodesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UbicacionBode ubicacionbodeAux:ubicacionbodesSeleccionados) {
				ubicacionbodeAux.setsDetalleGeneralEntityReporte(ubicacionbodeAux.toString());
			
				if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_IDUBICACIONBODE)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getubicacionbode_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_NIVEL)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getnivel().toString());
				}
				 else if(sTipoSeleccionar.equals(UbicacionBodeConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					ubicacionbodeAux.setsDescripcionGeneralEntityReporte1(ubicacionbodeAux.getorden().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UbicacionBodeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUbicacionBode(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUbicacionBode=true;
				this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=true;
				this.isVisibilidadCeldaGuardarCambiosUbicacionBode=true;
			}
			
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=true;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=true;
			this.isVisibilidadCeldaEliminarUbicacionBode=true;
			this.isVisibilidadCeldaCancelarUbicacionBode=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=true;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUbicacionBode=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=true;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=true;
			this.isVisibilidadCeldaModificarUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=true;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
			this.isVisibilidadCeldaModificarUbicacionBode=true;
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
			this.isVisibilidadCeldaCancelarUbicacionBode=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				} else {
					this.isVisibilidadCeldaGuardarUbicacionBode=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UbicacionBodeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUbicacionBode=true;
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=true;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=true;
		} else {
			this.actualizarEstadoPanelsUbicacionBode(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUbicacionBode=false;
			//this.isVisibilidadCeldaVerFormUbicacionBode=false;
			this.isVisibilidadCeldaDuplicarUbicacionBode=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ubicacionbodeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
		} else {
			this.isVisibilidadCeldaNuevoUbicacionBode=false;
			this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			if(!ubicacionbodeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;												
			}
			
			this.jButtonCerrarUbicacionBode.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUbicacionBode=false;
		}
		
		if(!this.permiteMantenimiento(this.ubicacionbode)) {
			this.isVisibilidadCeldaActualizarUbicacionBode=false;
			this.isVisibilidadCeldaEliminarUbicacionBode=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUbicacionBode() {
		this.isVisibilidadCeldaNuevoUbicacionBode=false;
		this.isVisibilidadCeldaGuardarCambiosUbicacionBode=false;
	}
	
	public void actualizarEstadoPanelsUbicacionBode(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUbicacionBode!=null) {
				this.jScrollPanelDatosEdicionUbicacionBode.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUbicacionBode!=null) {
				this.jScrollPanelDatosUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelPaginacionUbicacionBode!=null) {
				this.jPanelPaginacionUbicacionBode.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
					this.jTabbedPaneBusquedasUbicacionBode.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ubicacionbodeSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUbicacionBode!=null) {
				this.jTabbedPaneBusquedasUbicacionBode.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUbicacionBode!=null) {
				this.jPanelParametrosReportesUbicacionBode.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdBodegaUbicacionBode);}

			this.isVisibilidadFK_IdUbicacionBode=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdUbicacionBodeUbicacionBode);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdBodegaUbicacionBode);}

			this.isVisibilidadFK_IdUbicacionBode=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdUbicacionBodeUbicacionBode);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdBodegaUbicacionBode);}

			this.isVisibilidadFK_IdUbicacionBode=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdUbicacionBodeUbicacionBode);}
		}
		
	}

	public void setVisibilidadBusquedasParaUbicacionBode(Boolean isParaUbicacionBode){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUbicacionBodeNegation=!isParaUbicacionBode;

			this.isVisibilidadFK_IdBodega=isParaUbicacionBodeNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdBodegaUbicacionBode);}

			this.isVisibilidadFK_IdUbicacionBode=isParaUbicacionBode;
			if(!this.isVisibilidadFK_IdUbicacionBode) {this.jTabbedPaneBusquedasUbicacionBode.remove(jPanelFK_IdUbicacionBodeUbicacionBode);}
		}
		
	}
	
	

	public String registrarSesionUbicacionBodeParaUbicacionBodes() throws Exception {
		Boolean isPaginaPopupUbicacionBode=false;

		try {

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean==null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setsPathNavegacionActual(ubicacionbodeSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UbicacionBodeConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUbicacionBode=this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUbicacionBode(true);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUbicacionBode(UbicacionBodeConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setisBusquedaDesdeForeignKeySesionUbicacionBode(true);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionbodeSessionBean.setlidUbicacionBodeActual(this.idUbicacionBodeActual);

			ubicacionbodeSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUbicacionBode(true);
			ubicacionbodeSessionBean.setlIdUbicacionBodeActualForeignKey(this.idUbicacionBodeActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUbicacionBodeParaUbicacionProdus() throws Exception {
		Boolean isPaginaPopupUbicacionProdu=false;

		try {

			if(this.ubicacionbodeSessionBean==null) {
				this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
			}

			if(this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean==null) {
				this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean=new UbicacionProduSessionBean();
			}

			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setsPathNavegacionActual(ubicacionbodeSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+UbicacionProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupUbicacionProdu=this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeUbicacionProdu(true);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeUbicacionProdu(UbicacionBodeConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setisBusquedaDesdeForeignKeySesionUbicacionBode(true);
			this.jInternalFrameDetalleFormUbicacionBode.ubicacionproduSessionBean.setlidUbicacionBodeActual(this.idUbicacionBodeActual);

			ubicacionbodeSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUbicacionBode(true);
			ubicacionbodeSessionBean.setlIdUbicacionBodeActualForeignKey(this.idUbicacionBodeActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UbicacionBodeSessionBean ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		
		if(this.ubicacionbodeSessionBean==null) {
			this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		}
		
		this.ubicacionbodeSessionBean.setsUltimaBusquedaUbicacionBode(this.getsAccionBusqueda());
		this.ubicacionbodeSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ubicacionbodeSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			ubicacionbodeSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			ubicacionbodeSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			ubicacionbodeSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUbicacionBode")) {
			ubicacionbodeSessionBean.setid_ubicacion_bode(this.getid_ubicacion_bodeFK_IdUbicacionBode());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UbicacionBodeSessionBean ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		
		if(this.ubicacionbodeSessionBean==null) {
			this.ubicacionbodeSessionBean=new UbicacionBodeSessionBean();
		}
		
		if(this.ubicacionbodeSessionBean.getsUltimaBusquedaUbicacionBode()!=null&&!this.ubicacionbodeSessionBean.getsUltimaBusquedaUbicacionBode().equals("")) {
			this.setsAccionBusqueda(ubicacionbodeSessionBean.getsUltimaBusquedaUbicacionBode());
			this.setiNumeroPaginacion(ubicacionbodeSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ubicacionbodeSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(ubicacionbodeSessionBean.getid_bodega());
				ubicacionbodeSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(ubicacionbodeSessionBean.getid_empresa());
				ubicacionbodeSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(ubicacionbodeSessionBean.getid_sucursal());
				ubicacionbodeSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUbicacionBode")) {
				this.setid_ubicacion_bodeFK_IdUbicacionBode(ubicacionbodeSessionBean.getid_ubicacion_bode());
				ubicacionbodeSessionBean.setid_ubicacion_bode(null);
			}
		}
		
		this.ubicacionbodeSessionBean.setsUltimaBusquedaUbicacionBode("");
		this.ubicacionbodeSessionBean.setiNumeroPaginacion(UbicacionBodeConstantesFunciones.INUMEROPAGINACION);
		this.ubicacionbodeSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUbicacionBode(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUbicacionBode() {
		this.updateBorderResaltarBusquedasFormularioUbicacionBode();
		this.updateVisibilidadBusquedasFormularioUbicacionBode();
		this.updateHabilitarBusquedasFormularioUbicacionBode();
	}
	
	public void updateBorderResaltarBusquedasFormularioUbicacionBode() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUbicacionBode.getComponents().length>0) {
	

		if(this.ubicacionbodeConstantesFunciones.resaltarFK_IdBodegaUbicacionBode!=null) {
			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdBodegaUbicacionBode);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
				jPanel.setBorder(this.ubicacionbodeConstantesFunciones.resaltarFK_IdBodegaUbicacionBode);
			}
		}

		if(this.ubicacionbodeConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionBode!=null) {
			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionBode);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
				jPanel.setBorder(this.ubicacionbodeConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionBode);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUbicacionBode() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUbicacionBode.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdBodegaUbicacionBode);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ubicacionbodeConstantesFunciones.mostrarFK_IdBodegaUbicacionBode);
			if(!this.ubicacionbodeConstantesFunciones.mostrarFK_IdBodegaUbicacionBode && index>-1) {
				this.jTabbedPaneBusquedasUbicacionBode.remove(index);
			}

			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionBode);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ubicacionbodeConstantesFunciones.mostrarFK_IdUbicacionBodeUbicacionBode);
			if(!this.ubicacionbodeConstantesFunciones.mostrarFK_IdUbicacionBodeUbicacionBode && index>-1) {
				this.jTabbedPaneBusquedasUbicacionBode.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUbicacionBode() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUbicacionBode.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdBodegaUbicacionBode);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ubicacionbodeConstantesFunciones.activarFK_IdBodegaUbicacionBode);
				this.jTabbedPaneBusquedasUbicacionBode.setEnabledAt(index,this.ubicacionbodeConstantesFunciones.activarFK_IdBodegaUbicacionBode);
			}

			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionBode);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ubicacionbodeConstantesFunciones.activarFK_IdUbicacionBodeUbicacionBode);
				this.jTabbedPaneBusquedasUbicacionBode.setEnabledAt(index,this.ubicacionbodeConstantesFunciones.activarFK_IdUbicacionBodeUbicacionBode);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUbicacionBode(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdBodegaUbicacionBode);

			this.jTabbedPaneBusquedasUbicacionBode.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);

			this.ubicacionbodeConstantesFunciones.setResaltarFK_IdBodegaUbicacionBode(resaltar);

			jPanel.setBorder(this.ubicacionbodeConstantesFunciones.resaltarFK_IdBodegaUbicacionBode);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUbicacionBode")) {
			index= this.jTabbedPaneBusquedasUbicacionBode.indexOfComponent(this.jPanelFK_IdUbicacionBodeUbicacionBode);

			this.jTabbedPaneBusquedasUbicacionBode.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUbicacionBode.getComponent(index);

			this.ubicacionbodeConstantesFunciones.setResaltarFK_IdUbicacionBodeUbicacionBode(resaltar);

			jPanel.setBorder(this.ubicacionbodeConstantesFunciones.resaltarFK_IdUbicacionBodeUbicacionBode);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUbicacionBode.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUbicacionBode() throws Exception {

		if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUbicacionBode();
		this.updateVisibilidadResaltarControlesFormularioUbicacionBode();
		this.updateHabilitarResaltarControlesFormularioUbicacionBode();
		
	}
	
	public void updateBorderResaltarControlesFormularioUbicacionBode() throws Exception {
		if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ubicacionbodeConstantesFunciones.resaltaridUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltaridUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarid_empresaUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarid_empresaUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarid_sucursalUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarid_sucursalUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarid_bodegaUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarid_bodegaUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarid_ubicacion_bodeUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarid_ubicacion_bodeUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarnombreUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarnombreUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarnivelUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarnivelUbicacionBode);}
		if(this.ubicacionbodeConstantesFunciones.resaltarordenUbicacionBode!=null && this.jInternalFrameDetalleFormUbicacionBode!=null) {this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setBorder(this.ubicacionbodeConstantesFunciones.resaltarordenUbicacionBode);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUbicacionBode() throws Exception {		
		if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
	
		//this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostraridUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelidUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostraridUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_empresaUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelid_empresaUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_empresaUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_sucursalUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelid_sucursalUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_sucursalUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_bodegaUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelid_bodegaUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_bodegaUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_ubicacion_bodeUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelid_ubicacion_bodeUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarid_ubicacion_bodeUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarnombreUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelnombreUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarnombreUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarnivelUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelnivelUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarnivelUbicacionBode);
		//this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarordenUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jPanelordenUbicacionBode.setVisible(this.ubicacionbodeConstantesFunciones.mostrarordenUbicacionBode);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUbicacionBode() throws Exception {
		if(this.jInternalFrameDetalleFormUbicacionBode==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUbicacionBode!=null) {
	
		this.jInternalFrameDetalleFormUbicacionBode.jLabelidUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activaridUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_empresaUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarid_empresaUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_sucursalUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarid_sucursalUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_bodegaUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarid_bodegaUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jComboBoxid_ubicacion_bodeUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarid_ubicacion_bodeUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jTextAreanombreUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarnombreUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jTextFieldnivelUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarnivelUbicacionBode);
		this.jInternalFrameDetalleFormUbicacionBode.jTextFieldordenUbicacionBode.setEnabled(this.ubicacionbodeConstantesFunciones.activarordenUbicacionBode);
		}
	}
	
		
}