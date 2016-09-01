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

import com.bydan.erp.puntoventa.util.TarjetaCreditoDescuentoConstantesFunciones;
import com.bydan.erp.puntoventa.util.TarjetaCreditoDescuentoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TarjetaCreditoDescuentoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TarjetaCreditoDescuentoBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class TarjetaCreditoDescuentoBeanSwingJInternalFrame extends TarjetaCreditoDescuentoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TarjetaCreditoDescuentoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TarjetaCreditoDescuento> tarjetacreditodescuentoValidator = new ClassValidator<TarjetaCreditoDescuento>(TarjetaCreditoDescuento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TarjetaCreditoDescuento tarjetacreditodescuento;	
	public TarjetaCreditoDescuento tarjetacreditodescuentoAux;
	public TarjetaCreditoDescuento tarjetacreditodescuentoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TarjetaCreditoDescuento tarjetacreditodescuentoTotales;
	public Long idTarjetaCreditoDescuentoActual;
	public Long iIdNuevoTarjetaCreditoDescuento=0L;
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

	public String sFinalQueryComboTarjetaCredito="";

	public List<TarjetaCredito> tarjetacreditosForeignKey;

	public List<TarjetaCredito> gettarjetacreditosForeignKey() {
		return tarjetacreditosForeignKey;
	}

	public void settarjetacreditosForeignKey(List<TarjetaCredito> tarjetacreditosForeignKey) {
		this.tarjetacreditosForeignKey = tarjetacreditosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TarjetaCredito tarjetacreditoForeignKey;

	public TarjetaCredito gettarjetacreditoForeignKey() {
		return tarjetacreditoForeignKey;
	}

	public void settarjetacreditoForeignKey(TarjetaCredito tarjetacreditoForeignKey) {
		this.tarjetacreditoForeignKey = tarjetacreditoForeignKey;
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
	
	public Boolean isPermisoTodoTarjetaCreditoDescuento;
	public Boolean isPermisoNuevoTarjetaCreditoDescuento;
	public Boolean isPermisoActualizarTarjetaCreditoDescuento;
	public Boolean isPermisoActualizarOriginalTarjetaCreditoDescuento;
	public Boolean isPermisoEliminarTarjetaCreditoDescuento;
	public Boolean isPermisoGuardarCambiosTarjetaCreditoDescuento;
	public Boolean isPermisoConsultaTarjetaCreditoDescuento;
	public Boolean isPermisoBusquedaTarjetaCreditoDescuento;
	public Boolean isPermisoReporteTarjetaCreditoDescuento;
	public Boolean isPermisoPaginacionMedioTarjetaCreditoDescuento;
	public Boolean isPermisoPaginacionAltoTarjetaCreditoDescuento;
	public Boolean isPermisoPaginacionTodoTarjetaCreditoDescuento;
	public Boolean isPermisoCopiarTarjetaCreditoDescuento;
	public Boolean isPermisoVerFormTarjetaCreditoDescuento;
	public Boolean isPermisoDuplicarTarjetaCreditoDescuento;
	public Boolean isPermisoOrdenTarjetaCreditoDescuento;
	
	
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
	
	public TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoReturnGeneral;
	public TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTarjetaCreditoDescuento=false;
	public Boolean esParaAccionDesdeFormularioTarjetaCreditoDescuento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TarjetaCreditoDescuentoSessionBeanAdditional tarjetacreditodescuentoSessionBeanAdditional=null;
	
	public TarjetaCreditoDescuentoSessionBeanAdditional getTarjetaCreditoDescuentoSessionBeanAdditional() {
		return this.tarjetacreditodescuentoSessionBeanAdditional;
	}
	
	public void setTarjetaCreditoDescuentoSessionBeanAdditional(TarjetaCreditoDescuentoSessionBeanAdditional tarjetacreditodescuentoSessionBeanAdditional) {
		try {
			this.tarjetacreditodescuentoSessionBeanAdditional=tarjetacreditodescuentoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional tarjetacreditodescuentoBeanSwingJInternalFrameAdditional=null;
	//public class TarjetaCreditoDescuentoBeanSwingJInternalFrame
	
	public TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional getTarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional() {
		return this.tarjetacreditodescuentoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional(TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional tarjetacreditodescuentoBeanSwingJInternalFrameAdditional) {
		try {
			this.tarjetacreditodescuentoBeanSwingJInternalFrameAdditional=tarjetacreditodescuentoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TarjetaCreditoDescuentoLogic tarjetacreditodescuentoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TarjetaCreditoDescuento tarjetacreditodescuentoBean;
	public TarjetaCreditoDescuentoConstantesFunciones tarjetacreditodescuentoConstantesFunciones;
	//public TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TarjetaCreditoLogic tarjetacreditoLogic;
	
	//PARAMETROS
	
	
	//public List<TarjetaCreditoDescuento> tarjetacreditodescuentos;	
	//public List<TarjetaCreditoDescuento> tarjetacreditodescuentosEliminados;
	//public List<TarjetaCreditoDescuento> tarjetacreditodescuentosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaDuplicarTarjetaCreditoDescuento=true;
	public Boolean isVisibilidadCeldaCopiarTarjetaCreditoDescuento=true;
	public Boolean isVisibilidadCeldaVerFormTarjetaCreditoDescuento=true;
	public Boolean isVisibilidadCeldaOrdenTarjetaCreditoDescuento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaCancelarTarjetaCreditoDescuento=false;
	public Boolean isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTarjetaCredito=false;
	
	public Long getiIdNuevoTarjetaCreditoDescuento() {
		return this.iIdNuevoTarjetaCreditoDescuento;
	}

	public void setiIdNuevoTarjetaCreditoDescuento(Long iIdNuevoTarjetaCreditoDescuento) {
		this.iIdNuevoTarjetaCreditoDescuento = iIdNuevoTarjetaCreditoDescuento;
	}
	
	public Long getidTarjetaCreditoDescuentoActual() {
		return this.idTarjetaCreditoDescuentoActual;
	}

	public void setidTarjetaCreditoDescuentoActual(Long idTarjetaCreditoDescuentoActual) {
		this.idTarjetaCreditoDescuentoActual = idTarjetaCreditoDescuentoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TarjetaCreditoDescuento gettarjetacreditodescuento() {
		return this.tarjetacreditodescuento;
	}

	public void settarjetacreditodescuento(TarjetaCreditoDescuento tarjetacreditodescuento) {
		this.tarjetacreditodescuento = tarjetacreditodescuento;
	}
	
	public TarjetaCreditoDescuento gettarjetacreditodescuentoAux() {
		return this.tarjetacreditodescuentoAux;
	}

	public void settarjetacreditodescuentoAux(TarjetaCreditoDescuento tarjetacreditodescuentoAux) {
		this.tarjetacreditodescuentoAux = tarjetacreditodescuentoAux;
	}				
	
	public TarjetaCreditoDescuento gettarjetacreditodescuentoAnterior() {
		return this.tarjetacreditodescuentoAnterior;
	}

	public void settarjetacreditodescuentoAnterior(TarjetaCreditoDescuento tarjetacreditodescuentoAnterior) {
		this.tarjetacreditodescuentoAnterior = tarjetacreditodescuentoAnterior;
	}	
	
	public TarjetaCreditoDescuento gettarjetacreditodescuentoTotales() {
		return this.tarjetacreditodescuentoTotales;
	}

	public void settarjetacreditodescuentoTotales(TarjetaCreditoDescuento tarjetacreditodescuentoTotales) {
		this.tarjetacreditodescuentoTotales = tarjetacreditodescuentoTotales;
	}	
	
	public TarjetaCreditoDescuento gettarjetacreditodescuentoBean() {
		return this.tarjetacreditodescuentoBean;
	}

	public void settarjetacreditodescuentoBean(TarjetaCreditoDescuento tarjetacreditodescuentoBean) {
		this.tarjetacreditodescuentoBean = tarjetacreditodescuentoBean;
	}	
	
	public TarjetaCreditoDescuentoParameterReturnGeneral gettarjetacreditodescuentoReturnGeneral() {
		return this.tarjetacreditodescuentoReturnGeneral;
	}

	public void settarjetacreditodescuentoReturnGeneral(TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoReturnGeneral) {
		this.tarjetacreditodescuentoReturnGeneral = tarjetacreditodescuentoReturnGeneral;
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

	public Long id_tarjeta_creditoFK_IdTarjetaCredito=-1L;

	public Long getid_tarjeta_creditoFK_IdTarjetaCredito() {
		return this.id_tarjeta_creditoFK_IdTarjetaCredito;
	}

	public void setid_tarjeta_creditoFK_IdTarjetaCredito(Long id_tarjeta_creditoFK_IdTarjetaCredito) {
		this.id_tarjeta_creditoFK_IdTarjetaCredito = id_tarjeta_creditoFK_IdTarjetaCredito;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TarjetaCreditoDescuentoLogic getTarjetaCreditoDescuentoLogic()	{		
		return tarjetacreditodescuentoLogic;
	}

	public void setTarjetaCreditoDescuentoLogic(TarjetaCreditoDescuentoLogic tarjetacreditodescuentoLogic) {
		this.tarjetacreditodescuentoLogic = tarjetacreditodescuentoLogic;
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
	
	public Boolean getIsEsNuevoTarjetaCreditoDescuento() {
		return isEsNuevoTarjetaCreditoDescuento;
	}

	public void setIsEsNuevoTarjetaCreditoDescuento(Boolean isEsNuevoTarjetaCreditoDescuento) {
		this.isEsNuevoTarjetaCreditoDescuento = isEsNuevoTarjetaCreditoDescuento;
	}

	public Boolean getEsParaAccionDesdeFormularioTarjetaCreditoDescuento() {
		return esParaAccionDesdeFormularioTarjetaCreditoDescuento;
	}
	
	public void setEsParaAccionDesdeFormularioTarjetaCreditoDescuento(Boolean esParaAccionDesdeFormularioTarjetaCreditoDescuento) {
		this.esParaAccionDesdeFormularioTarjetaCreditoDescuento = esParaAccionDesdeFormularioTarjetaCreditoDescuento;
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

			if(this.tarjetacreditodescuentoSessionBean==null) {
				this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
			}

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tarjetacreditodescuentoSessionBean.getlidEmpresaActual());
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

			if(this.tarjetacreditodescuentoSessionBean==null) {
				this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
			}

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(tarjetacreditodescuentoSessionBean.getlidSucursalActual());
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

	public void cargarCombosTarjetaCreditosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TarjetaCreditoLogic tarjetacreditoLogic=new TarjetaCreditoLogic();

			//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

			if(this.tarjetacreditodescuentoSessionBean==null) {
				this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
			}

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tarjetacreditoLogic.getTarjetaCreditoDataAccess().setIsForForeingKeyData(true);

					tarjetacreditoLogic.getTodosTarjetaCreditosWithConnection(sFinalQuery,new Pagination());

					this.tarjetacreditosForeignKey=tarjetacreditoLogic.getTarjetaCreditos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTarjetaCredito(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditoLogic.getEntityWithConnection(tarjetacreditodescuentoSessionBean.getlidTarjetaCreditoActual());
					this.tarjetacreditosForeignKey.add(tarjetacreditoLogic.getTarjetaCredito());
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

					if(this.tarjetacreditodescuento!=null) {
						this.tarjetacreditodescuento.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTarjetaCreditoDescuentoGenerico)throws Exception
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
				jComboBoxid_empresaTarjetaCreditoDescuentoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTarjetaCreditoDescuentoGenerico!=null && jComboBoxid_empresaTarjetaCreditoDescuentoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTarjetaCreditoDescuentoGenerico.setSelectedIndex(0);
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

					if(this.tarjetacreditodescuento!=null) {
						this.tarjetacreditodescuento.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico)throws Exception
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
				jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico!=null && jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTarjetaCreditoForeignKey(Long idTarjetaCreditoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tarjetacreditoTemp!=null) {

					if(this.tarjetacreditodescuento!=null) {
						this.tarjetacreditodescuento.setTarjetaCredito(tarjetacreditoTemp);
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedItem(tarjetacreditoTemp);
					}
				} else {
					//jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedItem(tarjetacreditoTemp);
					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getItemCount()>0) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTarjetaCredito") || sFormularioTipoBusqueda.equals("Todos")){
					if(tarjetacreditoTemp!=null && jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento!=null) {
						jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setSelectedItem(tarjetacreditoTemp);
					} else {
						if(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento!=null) {
							//jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setSelectedItem(tarjetacreditoTemp);
							if(jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.getItemCount()>0) {
								jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setSelectedIndex(0);
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

	public String getActualTarjetaCreditoForeignKeyDescripcion(Long idTarjetaCreditoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}


			sDescripcion=TarjetaCreditoConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTarjetaCreditoForeignKeyGenerico(Long idTarjetaCreditoSeleccionado,JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoTemp=null;

			for(TarjetaCredito tarjetacreditoAux:tarjetacreditosForeignKey) {
				if(tarjetacreditoAux.getId()!=null && tarjetacreditoAux.getId().equals(idTarjetaCreditoSeleccionado)) {
					tarjetacreditoTemp=tarjetacreditoAux;
					break;
				}
			}

			if(tarjetacreditoTemp!=null) {
				jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico.setSelectedItem(tarjetacreditoTemp);
			} else {
				if(jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico!=null && jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico.getItemCount()>0) {
					jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TarjetaCreditoDescuento tarjetacreditodescuento,JComboBox jComboBoxid_empresaTarjetaCreditoDescuentoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTarjetaCreditoDescuentoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTarjetaCreditoDescuentoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tarjetacreditodescuento.setid_empresa(empresaAux.getId());
				tarjetacreditodescuento.setempresa_descripcion(TarjetaCreditoDescuentoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tarjetacreditodescuento.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TarjetaCreditoDescuento tarjetacreditodescuento,JComboBox jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTarjetaCreditoDescuentoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tarjetacreditodescuento.setid_sucursal(sucursalAux.getId());
				tarjetacreditodescuento.setsucursal_descripcion(TarjetaCreditoDescuentoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tarjetacreditodescuento.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTarjetaCreditoForeignKey(TarjetaCreditoDescuento tarjetacreditodescuento,JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico)throws Exception
	{
		try
		{
			TarjetaCredito  tarjetacreditoAux=new TarjetaCredito();

			if(jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico==null) {
				tarjetacreditoAux=(TarjetaCredito)this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getSelectedItem();
			} else {
				tarjetacreditoAux=(TarjetaCredito)jComboBoxid_tarjeta_creditoTarjetaCreditoDescuentoGenerico.getSelectedItem();
			}

			if(tarjetacreditoAux!=null && tarjetacreditoAux.getId()!=null) {
				tarjetacreditodescuento.setid_tarjeta_credito(tarjetacreditoAux.getId());
				tarjetacreditodescuento.settarjetacredito_descripcion(TarjetaCreditoDescuentoConstantesFunciones.getTarjetaCreditoDescripcion(tarjetacreditoAux));
				tarjetacreditodescuento.setTarjetaCredito(tarjetacreditoAux);			}
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

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
					}

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
					}

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTarjetaCreditosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTarjetaCredito=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.removeAllItems();

							for(TarjetaCredito tarjetacredito:this.tarjetacreditosForeignKey) {
								this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.addItem(tarjetacredito);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { 
					}

					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTarjetaCredito") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.removeAllItems();

							for(TarjetaCredito tarjetacredito:this.tarjetacreditosForeignKey) {
								this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.addItem(tarjetacredito);
							}
						}

						if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTarjetaCreditoForeignKey(TarjetaCredito tarjetacredito,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedItem(tarjetacredito);
						}
					} else {
						if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setSelectedItem(tarjetacredito);
						} else {
							this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTarjetaCreditoDescuento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TarjetaCreditoDescuentoConstantesFunciones.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TarjetaCreditoDescuentoConstantesFunciones.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento(this.tarjetacreditodescuentos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TarjetaCredito.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(this.tarjetacreditodescuentos);
			tarjetacreditodescuentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TarjetaCreditoDescuentoParameterReturnGeneral getTarjetaCreditoDescuentoParameterGeneral() {
		return this.tarjetacreditodescuentoParameterGeneral;
	}
	
	public void setTarjetaCreditoDescuentoParameterGeneral(TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoParameterGeneral) {
		this.tarjetacreditodescuentoParameterGeneral = tarjetacreditodescuentoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTarjetaCreditoDescuento() {
		return isPermisoTodoTarjetaCreditoDescuento;
	}

	public void setIsPermisoTodoTarjetaCreditoDescuento(Boolean isPermisoTodoTarjetaCreditoDescuento) {
		this.isPermisoTodoTarjetaCreditoDescuento = isPermisoTodoTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoNuevoTarjetaCreditoDescuento() {
		return isPermisoNuevoTarjetaCreditoDescuento;
	}

	public void setIsPermisoNuevoTarjetaCreditoDescuento(Boolean isPermisoNuevoTarjetaCreditoDescuento) {
		this.isPermisoNuevoTarjetaCreditoDescuento = isPermisoNuevoTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoActualizarTarjetaCreditoDescuento() {
		return isPermisoActualizarTarjetaCreditoDescuento;
	}

	public void setIsPermisoActualizarTarjetaCreditoDescuento(Boolean isPermisoActualizarTarjetaCreditoDescuento) {
		this.isPermisoActualizarTarjetaCreditoDescuento = isPermisoActualizarTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoEliminarTarjetaCreditoDescuento() {
		return isPermisoEliminarTarjetaCreditoDescuento;
	}

	public void setIsPermisoEliminarTarjetaCreditoDescuento(Boolean isPermisoEliminarTarjetaCreditoDescuento) {
		this.isPermisoEliminarTarjetaCreditoDescuento = isPermisoEliminarTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoGuardarCambiosTarjetaCreditoDescuento() {
		return isPermisoGuardarCambiosTarjetaCreditoDescuento;
	}

	public void setIsPermisoGuardarCambiosTarjetaCreditoDescuento(Boolean isPermisoGuardarCambiosTarjetaCreditoDescuento) {
		this.isPermisoGuardarCambiosTarjetaCreditoDescuento = isPermisoGuardarCambiosTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoConsultaTarjetaCreditoDescuento() {
		return isPermisoConsultaTarjetaCreditoDescuento;
	}

	public void setIsPermisoConsultaTarjetaCreditoDescuento(Boolean isPermisoConsultaTarjetaCreditoDescuento) {
		this.isPermisoConsultaTarjetaCreditoDescuento = isPermisoConsultaTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoBusquedaTarjetaCreditoDescuento() {
		return isPermisoBusquedaTarjetaCreditoDescuento;
	}

	public void setIsPermisoBusquedaTarjetaCreditoDescuento(Boolean isPermisoBusquedaTarjetaCreditoDescuento) {
		this.isPermisoBusquedaTarjetaCreditoDescuento = isPermisoBusquedaTarjetaCreditoDescuento;
	}

	public Boolean getIsPermisoReporteTarjetaCreditoDescuento() {
		return isPermisoReporteTarjetaCreditoDescuento;
	}

	public void setIsPermisoReporteTarjetaCreditoDescuento(Boolean isPermisoReporteTarjetaCreditoDescuento) {
		this.isPermisoReporteTarjetaCreditoDescuento = isPermisoReporteTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTarjetaCreditoDescuento() {
		return isPermisoPaginacionMedioTarjetaCreditoDescuento;
	}

	public void setIsPermisoPaginacionMedioTarjetaCreditoDescuento(Boolean isPermisoPaginacionMedioTarjetaCreditoDescuento) {
		this.isPermisoPaginacionMedioTarjetaCreditoDescuento = isPermisoPaginacionMedioTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTarjetaCreditoDescuento() {
		return isPermisoPaginacionTodoTarjetaCreditoDescuento;
	}

	public void setIsPermisoPaginacionTodoTarjetaCreditoDescuento(Boolean isPermisoPaginacionTodoTarjetaCreditoDescuento) {
		this.isPermisoPaginacionTodoTarjetaCreditoDescuento = isPermisoPaginacionTodoTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTarjetaCreditoDescuento() {
		return isPermisoPaginacionAltoTarjetaCreditoDescuento;
	}

	public void setIsPermisoPaginacionAltoTarjetaCreditoDescuento(Boolean isPermisoPaginacionAltoTarjetaCreditoDescuento) {
		this.isPermisoPaginacionAltoTarjetaCreditoDescuento = isPermisoPaginacionAltoTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoCopiarTarjetaCreditoDescuento() {
		return isPermisoCopiarTarjetaCreditoDescuento;
	}

	public void setIsPermisoCopiarTarjetaCreditoDescuento(Boolean isPermisoCopiarTarjetaCreditoDescuento) {
		this.isPermisoCopiarTarjetaCreditoDescuento = isPermisoCopiarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoVerFormTarjetaCreditoDescuento() {
		return isPermisoVerFormTarjetaCreditoDescuento;
	}

	public void setIsPermisoVerFormTarjetaCreditoDescuento(Boolean isPermisoVerFormTarjetaCreditoDescuento) {
		this.isPermisoVerFormTarjetaCreditoDescuento = isPermisoVerFormTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoDuplicarTarjetaCreditoDescuento() {
		return isPermisoDuplicarTarjetaCreditoDescuento;
	}

	public void setIsPermisoDuplicarTarjetaCreditoDescuento(Boolean isPermisoDuplicarTarjetaCreditoDescuento) {
		this.isPermisoDuplicarTarjetaCreditoDescuento = isPermisoDuplicarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsPermisoOrdenTarjetaCreditoDescuento() {
		return isPermisoOrdenTarjetaCreditoDescuento;
	}

	public void setIsPermisoOrdenTarjetaCreditoDescuento(Boolean isPermisoOrdenTarjetaCreditoDescuento) {
		this.isPermisoOrdenTarjetaCreditoDescuento = isPermisoOrdenTarjetaCreditoDescuento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTarjetaCreditoDescuento() {
		return isVisibilidadCeldaNuevoTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaNuevoTarjetaCreditoDescuento(Boolean isVisibilidadCeldaNuevoTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento = isVisibilidadCeldaNuevoTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaDuplicarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaDuplicarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaDuplicarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento = isVisibilidadCeldaDuplicarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaCopiarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaCopiarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaCopiarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento = isVisibilidadCeldaCopiarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTarjetaCreditoDescuento() {
		return isVisibilidadCeldaVerFormTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaVerFormTarjetaCreditoDescuento(Boolean isVisibilidadCeldaVerFormTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento = isVisibilidadCeldaVerFormTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTarjetaCreditoDescuento() {
		return isVisibilidadCeldaOrdenTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaOrdenTarjetaCreditoDescuento(Boolean isVisibilidadCeldaOrdenTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento = isVisibilidadCeldaOrdenTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento() {
		return isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento(Boolean isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento = isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaModificarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaModificarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaModificarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaModificarTarjetaCreditoDescuento = isVisibilidadCeldaModificarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaActualizarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaActualizarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaActualizarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento = isVisibilidadCeldaActualizarTarjetaCreditoDescuento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaEliminarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaEliminarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaEliminarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento = isVisibilidadCeldaEliminarTarjetaCreditoDescuento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaCancelarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaCancelarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaCancelarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento = isVisibilidadCeldaCancelarTarjetaCreditoDescuento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTarjetaCreditoDescuento() {
		return isVisibilidadCeldaGuardarTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaGuardarTarjetaCreditoDescuento(Boolean isVisibilidadCeldaGuardarTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento = isVisibilidadCeldaGuardarTarjetaCreditoDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento() {
		return isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento(Boolean isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento) {
		this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento = isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento;
	}
		
	public TarjetaCreditoDescuentoSessionBean gettarjetacreditodescuentoSessionBean() {
		return this.tarjetacreditodescuentoSessionBean;
	}
	
	public void settarjetacreditodescuentoSessionBean(TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean) {
		this.tarjetacreditodescuentoSessionBean=tarjetacreditodescuentoSessionBean;
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

	public Boolean getisVisibilidadFK_IdTarjetaCredito() {
		return this.isVisibilidadFK_IdTarjetaCredito;
	}

	public void setisVisibilidadFK_IdTarjetaCredito(Boolean isVisibilidadFK_IdTarjetaCredito) {
		this.isVisibilidadFK_IdTarjetaCredito=isVisibilidadFK_IdTarjetaCredito;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tarjetacreditodescuento,null);
				this.setActualParaGuardarSucursalForeignKey(tarjetacreditodescuento,null);
				this.setActualParaGuardarTarjetaCreditoForeignKey(tarjetacreditodescuento,null);
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
	
	public void bugActualizarReferenciaActual(TarjetaCreditoDescuento tarjetacreditodescuento,TarjetaCreditoDescuento tarjetacreditodescuentoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTarjetaCreditoDescuento(tarjetacreditodescuento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tarjetacreditodescuentoAux.setId(tarjetacreditodescuento.getId());
		tarjetacreditodescuentoAux.setVersionRow(tarjetacreditodescuento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTarjetaCreditoDescuento();
		
			int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tarjetacreditodescuentoValidator.getInvalidValues(this.tarjetacreditodescuento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tarjetacreditodescuentoLogic.setDatosCliente(datosCliente);
			tarjetacreditodescuentoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tarjetacreditodescuentoAux=new  TarjetaCreditoDescuento();
				
				tarjetacreditodescuentoAux.setIsNew(true);
				tarjetacreditodescuentoAux.setIsChanged(true);
				
				tarjetacreditodescuentoAux.setTarjetaCreditoDescuentoOriginal(this.tarjetacreditodescuento);
				
				tarjetacreditodescuentoAux.setId(this.tarjetacreditodescuento.getId());	
				tarjetacreditodescuentoAux.setVersionRow(this.tarjetacreditodescuento.getVersionRow());	
				tarjetacreditodescuentoAux.setid_empresa(this.tarjetacreditodescuento.getid_empresa());	
				tarjetacreditodescuentoAux.setid_sucursal(this.tarjetacreditodescuento.getid_sucursal());	
				tarjetacreditodescuentoAux.setid_tarjeta_credito(this.tarjetacreditodescuento.getid_tarjeta_credito());	
				tarjetacreditodescuentoAux.setporcentaje(this.tarjetacreditodescuento.getporcentaje());	
				tarjetacreditodescuentoAux.setnumero_meses(this.tarjetacreditodescuento.getnumero_meses());	
				tarjetacreditodescuentoAux.setes_corriente(this.tarjetacreditodescuento.getes_corriente());	
				tarjetacreditodescuentoAux.setcon_interes(this.tarjetacreditodescuento.getcon_interes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentos();//WithConnection
						//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);
					
					this.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentoRelaciones(tarjetacreditodescuentoAux);//WithConnection
								//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tarjetacreditodescuentoAux=new  TarjetaCreditoDescuento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() 
					|| (this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() && this.tarjetacreditodescuento.getId()>=0)) {
						
					tarjetacreditodescuentoAux.setIsNew(false);
				}
				
				tarjetacreditodescuentoAux.setIsDeleted(false);
			
				tarjetacreditodescuentoAux.setId(this.tarjetacreditodescuento.getId());	
				tarjetacreditodescuentoAux.setVersionRow(this.tarjetacreditodescuento.getVersionRow());	
				tarjetacreditodescuentoAux.setid_empresa(this.tarjetacreditodescuento.getid_empresa());	
				tarjetacreditodescuentoAux.setid_sucursal(this.tarjetacreditodescuento.getid_sucursal());	
				tarjetacreditodescuentoAux.setid_tarjeta_credito(this.tarjetacreditodescuento.getid_tarjeta_credito());	
				tarjetacreditodescuentoAux.setporcentaje(this.tarjetacreditodescuento.getporcentaje());	
				tarjetacreditodescuentoAux.setnumero_meses(this.tarjetacreditodescuento.getnumero_meses());	
				tarjetacreditodescuentoAux.setes_corriente(this.tarjetacreditodescuento.getes_corriente());	
				tarjetacreditodescuentoAux.setcon_interes(this.tarjetacreditodescuento.getcon_interes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentos();//WithConnection
						//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);
					
					this.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentoRelaciones(tarjetacreditodescuentoAux);//WithConnection
								//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tarjetacreditodescuento,tarjetacreditodescuentoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tarjetacreditodescuentoAux=new  TarjetaCreditoDescuento();
				
				tarjetacreditodescuentoAux.setIsNew(false);
				tarjetacreditodescuentoAux.setIsChanged(false);
				
				tarjetacreditodescuentoAux.setIsDeleted(true);
				
				tarjetacreditodescuentoAux.setId(this.tarjetacreditodescuento.getId());	
				tarjetacreditodescuentoAux.setVersionRow(this.tarjetacreditodescuento.getVersionRow());	
				tarjetacreditodescuentoAux.setid_empresa(this.tarjetacreditodescuento.getid_empresa());	
				tarjetacreditodescuentoAux.setid_sucursal(this.tarjetacreditodescuento.getid_sucursal());	
				tarjetacreditodescuentoAux.setid_tarjeta_credito(this.tarjetacreditodescuento.getid_tarjeta_credito());	
				tarjetacreditodescuentoAux.setporcentaje(this.tarjetacreditodescuento.getporcentaje());	
				tarjetacreditodescuentoAux.setnumero_meses(this.tarjetacreditodescuento.getnumero_meses());	
				tarjetacreditodescuentoAux.setes_corriente(this.tarjetacreditodescuento.getes_corriente());	
				tarjetacreditodescuentoAux.setcon_interes(this.tarjetacreditodescuento.getcon_interes());	
				
				if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tarjetacreditodescuentoAux.getId()>=0) {	
						this.tarjetacreditodescuentosEliminados.add(tarjetacreditodescuentoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentos();//WithConnection
						//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentoRelaciones(tarjetacreditodescuentoAux);//WithConnection
								//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
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
							if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tarjetacreditodescuentoAux,tarjetacreditodescuentos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().addAll(this.tarjetacreditodescuentosEliminados);
					
					tarjetacreditodescuentoLogic.saveTarjetaCreditoDescuentos();//WithConnection
					//tarjetacreditodescuentoLogic.getSetVersionRowTarjetaCreditoDescuentos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento();
				
				this.tarjetacreditodescuentosEliminados= new ArrayList<TarjetaCreditoDescuento>();		
			}
			
			if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tarjeta Credito Descuento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tarjetacreditodescuento=tarjetacreditodescuentoAux;
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
      		//this.finishProcessTarjetaCreditoDescuento();
      	}
		
	}	
	
	public void actualizarRelaciones(TarjetaCreditoDescuento tarjetacreditodescuentoLocal) throws Exception {
		
		if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TarjetaCreditoDescuento tarjetacreditodescuentoLocal) throws Exception {	
		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tarjetacreditodescuentoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tarjetacreditodescuentoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TarjetaCreditoDetalleFormJInternalFrame.class)) {
				TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrameLocal=(TarjetaCreditoBeanSwingJInternalFrame) ((TarjetaCreditoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tarjetacreditoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.gettarjetacredito(),true);
				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarLista(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito,this.tarjetacreditosForeignKey);

				tarjetacreditoBeanSwingJInternalFrameLocal.actualizarRelaciones(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				tarjetacreditodescuentoLocal.setTarjetaCredito(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito);

				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey("Formulario");
				this.setActualTarjetaCreditoForeignKey(tarjetacreditoBeanSwingJInternalFrameLocal.tarjetacredito.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTarjetaCreditoDescuentoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tarjetacreditodescuentoValidator.getInvalidValues(this.tarjetacreditodescuento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TarjetaCreditoDescuento tarjetacreditodescuento,List<TarjetaCreditoDescuento> tarjetacreditodescuentos) throws Exception {
		try	{		
			TarjetaCreditoDescuentoConstantesFunciones.actualizarLista(tarjetacreditodescuento,tarjetacreditodescuentos,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TarjetaCreditoDescuento tarjetacreditodescuento,List<TarjetaCreditoDescuento> tarjetacreditodescuentos) throws Exception {
		try	{			
			TarjetaCreditoDescuentoConstantesFunciones.actualizarSelectedLista(tarjetacreditodescuento,tarjetacreditodescuentos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TarjetaCreditoDescuento> tarjetacreditodescuentosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tarjetacreditodescuentosLocal=this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tarjetacreditodescuentosLocal=this.tarjetacreditodescuentos;
			}
			//ARCHITECTURE
		
			for(TarjetaCreditoDescuento tarjetacreditodescuentoLocal:tarjetacreditodescuentosLocal) {
				if(this.permiteMantenimiento(tarjetacreditodescuentoLocal) && tarjetacreditodescuentoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.getTarjetaCreditoDescuentoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_empresaTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_sucursalTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.IDTARJETACREDITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_tarjeta_creditoTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelporcentajeTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.NUMEROMESES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelnumero_mesesTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.ESCORRIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabeles_corrienteTarjetaCreditoDescuento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TarjetaCreditoDescuentoConstantesFunciones.CONINTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelcon_interesTarjetaCreditoDescuento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_empresaTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_sucursalTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelid_tarjeta_creditoTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelporcentajeTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelnumero_mesesTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabeles_corrienteTarjetaCreditoDescuento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelcon_interesTarjetaCreditoDescuento,"");
		
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
		this.iIdNuevoTarjetaCreditoDescuento--;	
		
		
		this.tarjetacreditodescuentoAux=new TarjetaCreditoDescuento();
		
		this.tarjetacreditodescuentoAux.setId(this.iIdNuevoTarjetaCreditoDescuento);
		this.tarjetacreditodescuentoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().add(this.tarjetacreditodescuentoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tarjetacreditodescuentos.add(this.tarjetacreditodescuentoAux);
		}
		//ARCHITECTURE
		
		this.tarjetacreditodescuento=this.tarjetacreditodescuentoAux;
		
		if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuento);
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoDescuento(this.tarjetacreditodescuento);
		}
				
		//this.setDefaultControlesTarjetaCreditoDescuento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTarjetaCreditoDescuento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoDescuento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoDescuento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuentoBean,this.tarjetacreditodescuento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
			classes=TarjetaCreditoDescuentoConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.procesarEventosTarjetaCreditoDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this.tarjetacreditodescuento,this.tarjetacreditodescuentoParameterGeneral,this.isEsNuevoTarjetaCreditoDescuento,classes);//this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral,this.tarjetacreditodescuentoBean,false);
		
		if(this.tarjetacreditodescuentoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento());
		}
		
		if(this.tarjetacreditodescuentoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento(),classes);//this.tarjetacreditodescuentoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTarjetaCreditoDescuento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTarjetaCreditoDescuento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.RecargarFormTarjetaCreditoDescuento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
						
			if(tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();
			}
			
			this.actualizarVisualTableDatosTarjetaCreditoDescuento();
			
			this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoDescuento(), this.getIndiceNuevoTarjetaCreditoDescuento());
			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
						
			this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTarjetaCreditoDescuento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarporcentajeTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarnumero_mesesTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activares_corrienteTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarcon_interesTarjetaCreditoDescuento);	
		//
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarid_empresaTarjetaCreditoDescuento);//
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarid_sucursalTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setEnabled(isHabilitar && this.tarjetacreditodescuentoConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoDescuento);
	};
	
	public void setDefaultControlesTarjetaCreditoDescuento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTarjetaCreditoDescuento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(true);			
			this.tarjetacreditodescuentoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.setVisible(true);
			
					
		} else {
			//this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(false);			
			this.tarjetacreditodescuentoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTarjetaCreditoDescuento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				if(tarjetacreditodescuentoAux.getId().equals(this.iIdNuevoTarjetaCreditoDescuento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentos) {
				if(tarjetacreditodescuentoAux.getId().equals(this.iIdNuevoTarjetaCreditoDescuento)) {
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
	
	public int getIndiceActualTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				if(tarjetacreditodescuentoAux.getId().equals(tarjetacreditodescuento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentos) {
				if(tarjetacreditodescuentoAux.getId().equals(tarjetacreditodescuento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuentoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				if(tarjetacreditodescuentoAux.getTarjetaCreditoDescuentoOriginal().getId().equals(tarjetacreditodescuentoOriginal.getId())) {
					existe=true;
					tarjetacreditodescuentoOriginal.setId(tarjetacreditodescuentoAux.getId());
					tarjetacreditodescuentoOriginal.setVersionRow(tarjetacreditodescuentoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentos) {
				if(tarjetacreditodescuentoAux.getTarjetaCreditoDescuentoOriginal().getId().equals(tarjetacreditodescuentoOriginal.getId())) {
					existe=true;
					tarjetacreditodescuentoOriginal.setId(tarjetacreditodescuentoAux.getId());
					tarjetacreditodescuentoOriginal.setVersionRow(tarjetacreditodescuentoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTarjetaCreditoDescuento(Boolean esParaCancelar) throws Exception {
		tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
		tarjetacreditodescuentoAux=new TarjetaCreditoDescuento();
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
					if(tarjetacreditodescuentoAux.getId()<0) {
						tarjetacreditodescuentosAux.add(tarjetacreditodescuentoAux);
					}		
				}
				this.iIdNuevoTarjetaCreditoDescuento=0L;
				this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().removeAll(tarjetacreditodescuentosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentos) {
					if(tarjetacreditodescuentoAux.getId()<0) {
						tarjetacreditodescuentosAux.add(tarjetacreditodescuentoAux);
					}		
				}
				this.iIdNuevoTarjetaCreditoDescuento=0L;
				this.tarjetacreditodescuentos.removeAll(tarjetacreditodescuentosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTarjetaCreditoDescuento 
					&& this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()>0
					) {
					tarjetacreditodescuentoAux=this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().get(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size() - 1);
				
					if(tarjetacreditodescuentoAux.getId()<0) {
						this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().remove(tarjetacreditodescuentoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTarjetaCreditoDescuento && this.tarjetacreditodescuentos.size()>0) {
					tarjetacreditodescuentoAux=this.tarjetacreditodescuentos.get(this.tarjetacreditodescuentos.size() - 1);
				
					if(tarjetacreditodescuentoAux.getId()<0) {
						this.tarjetacreditodescuentos.remove(tarjetacreditodescuentoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTarjetaCreditoDescuento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tarjetacreditodescuento.getId()<0) {
				this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().remove(this.tarjetacreditodescuento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tarjetacreditodescuento.getId()<0) {
				this.tarjetacreditodescuentos.remove(this.tarjetacreditodescuento);
			}
		}			
	}
	
	public void setEstadosInicialesTarjetaCreditoDescuento(List<TarjetaCreditoDescuento> tarjetacreditodescuentosAux) throws Exception {
		TarjetaCreditoDescuentoConstantesFunciones.setEstadosInicialesTarjetaCreditoDescuento(tarjetacreditodescuentosAux);
	}
	
	public void setEstadosInicialesTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuentoAux) throws Exception {
		TarjetaCreditoDescuentoConstantesFunciones.setEstadosInicialesTarjetaCreditoDescuento(tarjetacreditodescuentoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTarjetaCreditoDescuentoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTarjetaCreditoDescuentoActual()) {
				if(!this.isEsNuevoTarjetaCreditoDescuento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTarjetaCreditoDescuento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTarjetaCreditoDescuentoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tarjeta Credito Descuento ?", "MANTENIMIENTO DE Tarjeta Credito Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TarjetaCreditoDescuento tarjetacreditodescuento) throws Exception {
		TarjetaCreditoDescuentoConstantesFunciones.seleccionarAsignar(this.tarjetacreditodescuento,tarjetacreditodescuento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTarjetaCreditoDescuento=this.isPermisoActualizarOriginalTarjetaCreditoDescuento;
			
			
			this.seleccionarAsignar(tarjetacreditodescuento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TarjetaCreditoDescuentoConstantesFunciones.quitarEspaciosTarjetaCreditoDescuento(this.tarjetacreditodescuento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tarjetacreditodescuentoSessionBean.setsFuncionBusquedaRapida(this.tarjetacreditodescuentoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTarjetaCreditoDescuento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTarjetaCreditoDescuento(esParaCancelar);				
				this.cancelarNuevoTarjetaCreditoDescuento(esParaCancelar);								
			}
			
			this.tarjetacreditodescuento=new TarjetaCreditoDescuento();
			
			this.inicializarTarjetaCreditoDescuento();
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTarjetaCreditoDescuento() throws Exception {
		try {
			TarjetaCreditoDescuentoConstantesFunciones.inicializarTarjetaCreditoDescuento(this.tarjetacreditodescuento);
			
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
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTarjetaCreditoDescuentos(String sAccionBusqueda,List<TarjetaCreditoDescuento> tarjetacreditodescuentosParaReportes) throws Exception {
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
					sPathReporteFinal="TarjetaCreditoDescuento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TarjetaCreditoDescuentoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TarjetaCreditoDescuentoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TarjetaCreditoDescuento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tarjeta Credito Descuentos");		
		parameters.put("busquedapor", TarjetaCreditoDescuentoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTarjetaCreditoDescuento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TarjetaCreditoDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TarjetaCreditoDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTarjetaCreditoDescuento=new JRBeanArrayDataSource(TarjetaCreditoDescuentoJInternalFrame.TraerTarjetaCreditoDescuentoBeans(tarjetacreditodescuentosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTarjetaCreditoDescuento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TarjetaCreditoDescuentoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TarjetaCreditoDescuentoBean.TraerTarjetaCreditoDescuentoBeans(tarjetacreditodescuentosParaReportes).toArray()));
							
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
				this.generarExcelReporteTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuentoActionPerformed(null);
					//this.generarExcelReporteTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTarjetaCreditoDescuentos(sAccionBusqueda,sTipoArchivoReporte,tarjetacreditodescuentosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTarjetaCreditoDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoDescuento> tarjetacreditodescuentosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoDescuentos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetaCreditoDescuento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TarjetaCreditoDescuento tarjetacreditodescuento : tarjetacreditodescuentosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TarjetaCreditoDescuentoConstantesFunciones.generarExcelReporteDataTarjetaCreditoDescuento("NORMAL",row,workbook,tarjetacreditodescuento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTarjetaCreditoDescuento(String sTipo,Row row,Workbook workbook) {
		
		TarjetaCreditoDescuentoConstantesFunciones.generarExcelReporteHeaderTarjetaCreditoDescuento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTarjetaCreditoDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoDescuento> tarjetacreditodescuentosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoDescuentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TarjetaCreditoDescuento tarjetacreditodescuento : tarjetacreditodescuentosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.getTarjetaCreditoDescuentoDescripcion(tarjetacreditodescuento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditodescuento.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditodescuento.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditodescuento.gettarjetacredito_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditodescuento.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tarjetacreditodescuento.getnumero_meses());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tarjetacreditodescuento.getes_corriente()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tarjetacreditodescuento.getcon_interes()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTarjetaCreditoDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TarjetaCreditoDescuento> tarjetacreditodescuentosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TarjetaCreditoDescuento> tarjetacreditodescuentosRespaldo=null;
		
		classes=TarjetaCreditoDescuentoConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoDescuento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tarjetacreditodescuentoLogic.setDatosCliente(this.datosCliente);
		this.tarjetacreditodescuentoLogic.setDatosDeep(this.datosDeep);
		this.tarjetacreditodescuentoLogic.setIsConDeep(true);
		
		tarjetacreditodescuentosRespaldo=this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos();
		
		this.tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(tarjetacreditodescuentosParaReportes);	
		this.tarjetacreditodescuentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tarjetacreditodescuentosParaReportes=this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos();
		this.tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(tarjetacreditodescuentosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TarjetaCreditoDescuentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTarjetaCreditoDescuento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TarjetaCreditoDescuento tarjetacreditodescuento : tarjetacreditodescuentosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTarjetaCreditoDescuento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TarjetaCreditoDescuentoConstantesFunciones.generarExcelReporteDataTarjetaCreditoDescuento("NORMAL",row,workbook,tarjetacreditodescuento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.getTarjetaCreditoDescuentoDescripcion(tarjetacreditodescuento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTarjetaCreditoDescuento() throws Exception {		
		this.startProcessTarjetaCreditoDescuento(true);
	}
	
	public void startProcessTarjetaCreditoDescuento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTarjetaCreditoDescuento ,this.jPanelParametrosReportesTarjetaCreditoDescuento, this.jScrollPanelDatosTarjetaCreditoDescuento,this.jPanelPaginacionTarjetaCreditoDescuento, this.jScrollPanelDatosEdicionTarjetaCreditoDescuento, this.jPanelAccionesTarjetaCreditoDescuento,this.jPanelAccionesFormularioTarjetaCreditoDescuento,this.jmenuBarTarjetaCreditoDescuento,this.jmenuBarDetalleTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetaCreditoDescuento=this.jTabbedPaneBusquedasTarjetaCreditoDescuento; 
		
		final JPanel jPanelParametrosReportesTarjetaCreditoDescuento=this.jPanelParametrosReportesTarjetaCreditoDescuento;
		//final JScrollPane jScrollPanelDatosTarjetaCreditoDescuento=this.jScrollPanelDatosTarjetaCreditoDescuento;
		final JTable jTableDatosTarjetaCreditoDescuento=this.jTableDatosTarjetaCreditoDescuento;		
		final JPanel jPanelPaginacionTarjetaCreditoDescuento=this.jPanelPaginacionTarjetaCreditoDescuento;
		//final JScrollPane jScrollPanelDatosEdicionTarjetaCreditoDescuento=this.jScrollPanelDatosEdicionTarjetaCreditoDescuento;
		final JPanel jPanelAccionesTarjetaCreditoDescuento=this.jPanelAccionesTarjetaCreditoDescuento;
		
		JPanel jPanelCamposAuxiliarTarjetaCreditoDescuento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			jPanelCamposAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelCamposTarjetaCreditoDescuento;
			jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelAccionesFormularioTarjetaCreditoDescuento;
		}
		
		final JPanel jPanelCamposTarjetaCreditoDescuento=jPanelCamposAuxiliarTarjetaCreditoDescuento;
		final JPanel jPanelAccionesFormularioTarjetaCreditoDescuento=jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento;
		
		
		final JMenuBar jmenuBarTarjetaCreditoDescuento=this.jmenuBarTarjetaCreditoDescuento;
		final JToolBar jTtoolBarTarjetaCreditoDescuento=this.jTtoolBarTarjetaCreditoDescuento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTarjetaCreditoDescuento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			jmenuBarDetalleAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jmenuBarDetalleTarjetaCreditoDescuento;
			jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTtoolBarDetalleTarjetaCreditoDescuento;
		}
		
		final JMenuBar jmenuBarDetalleTarjetaCreditoDescuento=jmenuBarDetalleAuxiliarTarjetaCreditoDescuento;
		final JToolBar jTtoolBarDetalleTarjetaCreditoDescuento=jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetaCreditoDescuento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetaCreditoDescuento;
			processRunnable.jTableDatos=jTableDatosTarjetaCreditoDescuento;
			processRunnable.jPanelCampos=jPanelCamposTarjetaCreditoDescuento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetaCreditoDescuento;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetaCreditoDescuento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetaCreditoDescuento;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetaCreditoDescuento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetaCreditoDescuento;
			processRunnable.jTtoolBar=jTtoolBarTarjetaCreditoDescuento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetaCreditoDescuento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetaCreditoDescuento ,jPanelParametrosReportesTarjetaCreditoDescuento,jTableDatosTarjetaCreditoDescuento, /*jScrollPanelDatosTarjetaCreditoDescuento,*/jPanelCamposTarjetaCreditoDescuento,jPanelPaginacionTarjetaCreditoDescuento, /*jScrollPanelDatosEdicionTarjetaCreditoDescuento,*/ jPanelAccionesTarjetaCreditoDescuento,jPanelAccionesFormularioTarjetaCreditoDescuento,jmenuBarTarjetaCreditoDescuento,jmenuBarDetalleTarjetaCreditoDescuento,jTtoolBarTarjetaCreditoDescuento,jTtoolBarDetalleTarjetaCreditoDescuento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTarjetaCreditoDescuento ,jPanelParametrosReportesTarjetaCreditoDescuento, jScrollPanelDatosTarjetaCreditoDescuento,jPanelPaginacionTarjetaCreditoDescuento, jScrollPanelDatosEdicionTarjetaCreditoDescuento, jPanelAccionesTarjetaCreditoDescuento,jPanelAccionesFormularioTarjetaCreditoDescuento,jmenuBarTarjetaCreditoDescuento,jmenuBarDetalleTarjetaCreditoDescuento,jTtoolBarTarjetaCreditoDescuento,jTtoolBarDetalleTarjetaCreditoDescuento);
						
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
	
	public void finishProcessTarjetaCreditoDescuento() {// throws Exception 
		this.finishProcessTarjetaCreditoDescuento(true);
	}
	
	public void finishProcessTarjetaCreditoDescuento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTarjetaCreditoDescuento ,this.jPanelParametrosReportesTarjetaCreditoDescuento, this.jScrollPanelDatosTarjetaCreditoDescuento,this.jPanelPaginacionTarjetaCreditoDescuento, this.jScrollPanelDatosEdicionTarjetaCreditoDescuento, this.jPanelAccionesTarjetaCreditoDescuento,this.jPanelAccionesFormularioTarjetaCreditoDescuento,this.jmenuBarTarjetaCreditoDescuento,this.jmenuBarDetalleTarjetaCreditoDescuento,this.jTtoolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento);		
		
		final JTabbedPane jTabbedPaneBusquedasTarjetaCreditoDescuento=this.jTabbedPaneBusquedasTarjetaCreditoDescuento; 
		
		final JPanel jPanelParametrosReportesTarjetaCreditoDescuento=this.jPanelParametrosReportesTarjetaCreditoDescuento;
		//final JScrollPane jScrollPanelDatosTarjetaCreditoDescuento=this.jScrollPanelDatosTarjetaCreditoDescuento;
		final JTable jTableDatosTarjetaCreditoDescuento=this.jTableDatosTarjetaCreditoDescuento;		
		final JPanel jPanelPaginacionTarjetaCreditoDescuento=this.jPanelPaginacionTarjetaCreditoDescuento;
		//final JScrollPane jScrollPanelDatosEdicionTarjetaCreditoDescuento=this.jScrollPanelDatosEdicionTarjetaCreditoDescuento;
		final JPanel jPanelAccionesTarjetaCreditoDescuento=this.jPanelAccionesTarjetaCreditoDescuento;
		
		JPanel jPanelCamposAuxiliarTarjetaCreditoDescuento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			jPanelCamposAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelCamposTarjetaCreditoDescuento;
			jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelAccionesFormularioTarjetaCreditoDescuento;
		}
		
		final JPanel jPanelCamposTarjetaCreditoDescuento=jPanelCamposAuxiliarTarjetaCreditoDescuento;
		final JPanel jPanelAccionesFormularioTarjetaCreditoDescuento=jPanelAccionesFormularioAuxiliarTarjetaCreditoDescuento;
		
		
		final JMenuBar jmenuBarTarjetaCreditoDescuento=this.jmenuBarTarjetaCreditoDescuento;		
		final JToolBar jTtoolBarTarjetaCreditoDescuento=this.jTtoolBarTarjetaCreditoDescuento;
				
		JMenuBar jmenuBarDetalleAuxiliarTarjetaCreditoDescuento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			jmenuBarDetalleAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jmenuBarDetalleTarjetaCreditoDescuento;
			jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTtoolBarDetalleTarjetaCreditoDescuento;		
		}
		
		final JMenuBar jmenuBarDetalleTarjetaCreditoDescuento=jmenuBarDetalleAuxiliarTarjetaCreditoDescuento;
		final JToolBar jTtoolBarDetalleTarjetaCreditoDescuento=jTtoolBarDetalleAuxiliarTarjetaCreditoDescuento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTarjetaCreditoDescuento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTarjetaCreditoDescuento;
			processRunnable.jTableDatos=jTableDatosTarjetaCreditoDescuento;
			processRunnable.jPanelCampos=jPanelCamposTarjetaCreditoDescuento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTarjetaCreditoDescuento;
			processRunnable.jPanelAcciones=jPanelAccionesTarjetaCreditoDescuento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTarjetaCreditoDescuento;
			
			
			processRunnable.jmenuBar=jmenuBarTarjetaCreditoDescuento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTarjetaCreditoDescuento;
			processRunnable.jTtoolBar=jTtoolBarTarjetaCreditoDescuento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTarjetaCreditoDescuento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTarjetaCreditoDescuento ,jPanelParametrosReportesTarjetaCreditoDescuento, jTableDatosTarjetaCreditoDescuento,/*jScrollPanelDatosTarjetaCreditoDescuento,*/jPanelCamposTarjetaCreditoDescuento,jPanelPaginacionTarjetaCreditoDescuento, /*jScrollPanelDatosEdicionTarjetaCreditoDescuento,*/ jPanelAccionesTarjetaCreditoDescuento,jPanelAccionesFormularioTarjetaCreditoDescuento,jmenuBarTarjetaCreditoDescuento,jmenuBarDetalleTarjetaCreditoDescuento,jTtoolBarTarjetaCreditoDescuento,jTtoolBarDetalleTarjetaCreditoDescuento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTarjetaCreditoDescuento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTarjetaCreditoDescuento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTarjetaCreditoDescuento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTarjetaCreditoDescuento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTarjetaCreditoDescuento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTarjetaCreditoDescuento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTarjetaCreditoDescuento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTarjetaCreditoDescuento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTarjetaCreditoDescuento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tarjetacreditodescuentoConstantesFunciones.getsFinalQueryTarjetaCreditoDescuento();
		String  finalQueryPaginacionTodos=this.tarjetacreditodescuentoConstantesFunciones.getsFinalQueryTarjetaCreditoDescuento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TarjetaCreditoDescuentoConstantesFunciones.getArrayColumnasGlobalesNoTarjetaCreditoDescuento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TarjetaCreditoDescuentoConstantesFunciones.getArrayColumnasGlobalesTarjetaCreditoDescuento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TarjetaCreditoDescuentoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tarjetacreditodescuentosEliminados= new ArrayList<TarjetaCreditoDescuento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTarjetaCreditoDescuento();
		
				///*TarjetaCreditoDescuentoSessionBean*/this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
			
			if(this.tarjetacreditodescuentoSessionBean==null) {
				this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
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
					this.iNumeroPaginacion=TarjetaCreditoDescuentoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TarjetaCreditoDescuentoConstantesFunciones.getClassesForeignKeysOfTarjetaCreditoDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tarjetacreditodescuento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tarjetacreditodescuentosAux= new ArrayList<TarjetaCreditoDescuento>();
			
				
			tarjetacreditodescuentoLogic.setDatosCliente(this.datosCliente);
			tarjetacreditodescuentoLogic.setDatosDeep(this.datosDeep);
			tarjetacreditodescuentoLogic.setIsConDeep(true);
			
			
			tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tarjetacreditodescuentoLogic.getTodosTarjetaCreditoDescuentos(finalQueryGlobal,pagination);
					
					//tarjetacreditodescuentoLogic.getTodosTarjetaCreditoDescuentosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()==null|| tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditodescuentosAux= new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentosAux= new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditodescuentoLogic.getTodosTarjetaCreditoDescuentos(finalQueryGlobal+"",this.pagination);												
							
							//tarjetacreditodescuentoLogic.getTodosTarjetaCreditoDescuentosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(new ArrayList<TarjetaCreditoDescuento>());					
							tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().addAll(tarjetacreditodescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentos.addAll(tarjetacreditodescuentosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTarjetaCreditoDescuento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTarjetaCreditoDescuento=this.idActual;
				
				} else if(this.idTarjetaCreditoDescuentoActual!=null && this.idTarjetaCreditoDescuentoActual!=0L) {
					idTarjetaCreditoDescuento=idTarjetaCreditoDescuentoActual;
				}
				
					
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndicePorId(idTarjetaCreditoDescuento);
				
				this.tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tarjetacreditodescuentoLogic.getEntity(idTarjetaCreditoDescuento);
					
					//tarjetacreditodescuentoLogic.getEntityWithConnection(idTarjetaCreditoDescuento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(new ArrayList<TarjetaCreditoDescuento>());
					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().add(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
					this.tarjetacreditodescuentos.add(tarjetacreditodescuento);
				}
				
				if(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()==null||tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditodescuentos==null|| tarjetacreditodescuentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
						tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoDescuentos("FK_IdEmpresa",tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoDescuentos("FK_IdEmpresa",tarjetacreditodescuentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(new ArrayList<TarjetaCreditoDescuento>());
						tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().addAll(tarjetacreditodescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentos.addAll(tarjetacreditodescuentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()==null||tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditodescuentos==null|| tarjetacreditodescuentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
						tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoDescuentos("FK_IdSucursal",tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoDescuentos("FK_IdSucursal",tarjetacreditodescuentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(new ArrayList<TarjetaCreditoDescuento>());
						tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().addAll(tarjetacreditodescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentos.addAll(tarjetacreditodescuentosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTarjetaCredito")) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdTarjetaCredito(finalQueryGlobal,pagination,id_tarjeta_creditoFK_IdTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()==null||tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tarjetacreditodescuentos==null|| tarjetacreditodescuentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
						tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentosAux=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentosAux.addAll(tarjetacreditodescuentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdTarjetaCredito(finalQueryGlobal,pagination,id_tarjeta_creditoFK_IdTarjetaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TarjetaCreditoDescuentoConstantesFunciones.getDetalleIndiceFK_IdTarjetaCredito(id_tarjeta_creditoFK_IdTarjetaCredito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTarjetaCreditoDescuentos("FK_IdTarjetaCredito",tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTarjetaCreditoDescuentos("FK_IdTarjetaCredito",tarjetacreditodescuentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(new ArrayList<TarjetaCreditoDescuento>());
						tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().addAll(tarjetacreditodescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentos=new ArrayList<TarjetaCreditoDescuento>();
							tarjetacreditodescuentos.addAll(tarjetacreditodescuentosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTarjetaCreditoDescuento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTarjetaCreditoDescuento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditodescuentos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tarjetacreditodescuentos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TarjetaCreditoDescuento tarjetacreditodescuento) {
		Boolean permite=true;
		
		if(this.tarjetacreditodescuento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TarjetaCreditoDescuentoConstantesFunciones.getOrderByListaTarjetaCreditoDescuento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TarjetaCreditoDescuentoConstantesFunciones.getOrderByListaTarjetaCreditoDescuento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				if(tarjetacreditodescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditodescuentoTotales=tarjetacreditodescuento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoDescuento tarjetacreditodescuento:this.tarjetacreditodescuentos) {
				if(tarjetacreditodescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditodescuentoTotales=tarjetacreditodescuento;
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
			this.tarjetacreditodescuentoAux=new TarjetaCreditoDescuento();
			this.tarjetacreditodescuentoAux.setsType(Constantes2.S_TOTALES);
			this.tarjetacreditodescuentoAux.setIsNew(false);
			this.tarjetacreditodescuentoAux.setIsChanged(false);
			this.tarjetacreditodescuentoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TarjetaCreditoDescuentoConstantesFunciones.TotalizarValoresFilaTarjetaCreditoDescuento(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this.tarjetacreditodescuentoAux);
				
				this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().add(this.tarjetacreditodescuentoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TarjetaCreditoDescuentoConstantesFunciones.TotalizarValoresFilaTarjetaCreditoDescuento(this.tarjetacreditodescuentos,this.tarjetacreditodescuentoAux);
				
				this.tarjetacreditodescuentos.add(this.tarjetacreditodescuentoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tarjetacreditodescuentoTotales=new TarjetaCreditoDescuento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().remove(tarjetacreditodescuentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tarjetacreditodescuentos.remove(tarjetacreditodescuentoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tarjetacreditodescuentoTotales=new TarjetaCreditoDescuento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				if(tarjetacreditodescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditodescuentoTotales=tarjetacreditodescuento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetaCreditoDescuentoConstantesFunciones.TotalizarValoresFilaTarjetaCreditoDescuento(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),tarjetacreditodescuentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TarjetaCreditoDescuento tarjetacreditodescuento:this.tarjetacreditodescuentos) {
				if(tarjetacreditodescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tarjetacreditodescuentoTotales=tarjetacreditodescuento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TarjetaCreditoDescuentoConstantesFunciones.TotalizarValoresFilaTarjetaCreditoDescuento(this.tarjetacreditodescuentos,tarjetacreditodescuentoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTarjetaCreditoDescuentosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetaCreditoDescuentosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTarjetaCreditoDescuentosFK_IdTarjetaCredito()throws Exception {
		try {
			sAccionBusqueda="FK_IdTarjetaCredito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTarjetaCreditoDescuentosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetaCreditoDescuentosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTarjetaCreditoDescuentosFK_IdTarjetaCredito(String sFinalQuery,Long id_tarjeta_credito)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentosFK_IdTarjetaCredito(sFinalQuery,this.pagination,id_tarjeta_credito);
				
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
	
	public void inicializarPermisosTarjetaCreditoDescuento() {
		this.isPermisoTodoTarjetaCreditoDescuento=false;
		this.isPermisoNuevoTarjetaCreditoDescuento=false;
		this.isPermisoActualizarTarjetaCreditoDescuento=false;
		this.isPermisoActualizarOriginalTarjetaCreditoDescuento=false;
		this.isPermisoEliminarTarjetaCreditoDescuento=false;
		this.isPermisoGuardarCambiosTarjetaCreditoDescuento=false;
		this.isPermisoConsultaTarjetaCreditoDescuento=false;
		this.isPermisoBusquedaTarjetaCreditoDescuento=false;
		this.isPermisoReporteTarjetaCreditoDescuento=false;		
		this.isPermisoOrdenTarjetaCreditoDescuento=false;		
		this.isPermisoPaginacionMedioTarjetaCreditoDescuento=false;		
		this.isPermisoPaginacionAltoTarjetaCreditoDescuento=false;
		this.isPermisoPaginacionTodoTarjetaCreditoDescuento=false;
		this.isPermisoCopiarTarjetaCreditoDescuento=false;		
		this.isPermisoVerFormTarjetaCreditoDescuento=false;		
		this.isPermisoDuplicarTarjetaCreditoDescuento=false;		
		this.isPermisoOrdenTarjetaCreditoDescuento=false;		
	}
	
	public void setPermisosUsuarioTarjetaCreditoDescuento(Boolean isPermiso) {
		this.isPermisoTodoTarjetaCreditoDescuento=isPermiso;
		this.isPermisoNuevoTarjetaCreditoDescuento=isPermiso;
		this.isPermisoActualizarTarjetaCreditoDescuento=isPermiso;
		this.isPermisoActualizarOriginalTarjetaCreditoDescuento=isPermiso;
		this.isPermisoEliminarTarjetaCreditoDescuento=isPermiso;
		this.isPermisoGuardarCambiosTarjetaCreditoDescuento=isPermiso;
		this.isPermisoConsultaTarjetaCreditoDescuento=isPermiso;
		this.isPermisoBusquedaTarjetaCreditoDescuento=isPermiso;
		this.isPermisoReporteTarjetaCreditoDescuento=isPermiso;
		this.isPermisoOrdenTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoPaginacionMedioTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoPaginacionAltoTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoPaginacionTodoTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoCopiarTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoVerFormTarjetaCreditoDescuento=isPermiso;		
		this.isPermisoDuplicarTarjetaCreditoDescuento=isPermiso;
		this.isPermisoOrdenTarjetaCreditoDescuento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTarjetaCreditoDescuento(Boolean isPermiso) {
		//this.isPermisoTodoTarjetaCreditoDescuento=isPermiso;
		this.isPermisoNuevoTarjetaCreditoDescuento=isPermiso;
		this.isPermisoActualizarTarjetaCreditoDescuento=isPermiso;
		this.isPermisoActualizarOriginalTarjetaCreditoDescuento=isPermiso;
		this.isPermisoEliminarTarjetaCreditoDescuento=isPermiso;
		this.isPermisoGuardarCambiosTarjetaCreditoDescuento=isPermiso;
		//this.isPermisoConsultaTarjetaCreditoDescuento=isPermiso;
		//this.isPermisoBusquedaTarjetaCreditoDescuento=isPermiso;
		//this.isPermisoReporteTarjetaCreditoDescuento=isPermiso;
		//this.isPermisoOrdenTarjetaCreditoDescuento=isPermiso;		
		//this.isPermisoPaginacionMedioTarjetaCreditoDescuento=isPermiso;		
		//this.isPermisoPaginacionAltoTarjetaCreditoDescuento=isPermiso;		
		//this.isPermisoPaginacionTodoTarjetaCreditoDescuento=isPermiso;		
		//this.isPermisoCopiarTarjetaCreditoDescuento=isPermiso;		
		//this.isPermisoDuplicarTarjetaCreditoDescuento=isPermiso;
		//this.isPermisoOrdenTarjetaCreditoDescuento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTarjetaCreditoDescuentoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TarjetaCreditoDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTarjetaCreditoDescuento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTarjetaCreditoDescuentoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTarjetaCreditoDescuentoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTarjetaCreditoDescuentoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTarjetaCreditoDescuentoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTarjetaCreditoDescuento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TarjetaCreditoDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TarjetaCreditoDescuentoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTarjetaCreditoDescuento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTarjetaCreditoDescuento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTarjetaCreditoDescuento=this.isPermisoActualizarTarjetaCreditoDescuento;
			this.isPermisoEliminarTarjetaCreditoDescuento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTarjetaCreditoDescuento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTarjetaCreditoDescuento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTarjetaCreditoDescuento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTarjetaCreditoDescuento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTarjetaCreditoDescuento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetaCreditoDescuento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTarjetaCreditoDescuento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTarjetaCreditoDescuento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTarjetaCreditoDescuento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTarjetaCreditoDescuento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTarjetaCreditoDescuento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTarjetaCreditoDescuento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTarjetaCreditoDescuento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTarjetaCreditoDescuento.setToolTipText(this.jTableDatosTarjetaCreditoDescuento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTarjetaCreditoDescuento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTarjetaCreditoDescuento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTarjetaCreditoDescuento() throws Exception {
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
	public void inicializarCombosForeignKeyTarjetaCreditoDescuentoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tarjetacreditosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTarjetaCreditoDescuentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TarjetaCreditoDescuentoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTarjetaCreditoDescuentoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTarjetaCreditoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tarjetacreditosForeignKey==null||this.tarjetacreditosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TarjetaCreditoConstantesFunciones.getArrayColumnasGlobalesTarjetaCredito(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TarjetaCreditoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TarjetaCreditoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTarjetaCreditosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTarjetaCreditoDescuentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoReturnGeneral=new TarjetaCreditoDescuentoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tarjetacreditodescuentoConstantesFunciones.cargarid_empresaTarjetaCreditoDescuento)
					 || (this.esRecargarFks && this.tarjetacreditodescuentoConstantesFunciones.cargarid_empresaTarjetaCreditoDescuento)) {

					if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tarjetacreditodescuentoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.tarjetacreditodescuentoConstantesFunciones.cargarid_sucursalTarjetaCreditoDescuento)
					 || (this.esRecargarFks && this.tarjetacreditodescuentoConstantesFunciones.cargarid_sucursalTarjetaCreditoDescuento)) {

					if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+tarjetacreditodescuentoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTarjetaCredito="";

				if(((this.tarjetacreditosForeignKey==null||this.tarjetacreditosForeignKey.size()<=0) && this.tarjetacreditodescuentoConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoDescuento)
					 || (this.esRecargarFks && this.tarjetacreditodescuentoConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoDescuento)) {

					if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TarjetaCreditoConstantesFunciones.getArrayColumnasGlobalesTarjetaCredito(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTarjetaCredito=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TarjetaCreditoConstantesFunciones.TABLENAME);

						finalQueryGlobalTarjetaCredito=Funciones.GetFinalQueryAppend(finalQueryGlobalTarjetaCredito, "");
						finalQueryGlobalTarjetaCredito+=TarjetaCreditoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTarjetaCreditosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTarjetaCredito=" WHERE " + ConstantesSql.ID + "="+tarjetacreditodescuentoSessionBean.getlidTarjetaCreditoActual();
					}
				} else {
					finalQueryGlobalTarjetaCredito="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.cargarCombosLoteForeignKeyTarjetaCreditoDescuento(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTarjetaCredito);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tarjetacreditodescuentoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=tarjetacreditodescuentoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTarjetaCredito.equals("NONE")) {
				this.tarjetacreditosForeignKey=tarjetacreditodescuentoReturnGeneral.gettarjetacreditosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTarjetaCreditoDescuento()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTarjetaCredito();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tarjetacreditodescuentoSessionBean==null) {
				this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
			}

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTarjetaCredito()throws Exception {
		try {

			if(!this.tarjetacreditodescuentoSessionBean.getisBusquedaDesdeForeignKeySesionTarjetaCredito()) {
				TarjetaCredito tarjetacredito=new TarjetaCredito();
				TarjetaCreditoConstantesFunciones.setTarjetaCreditoDescripcion(tarjetacredito,Constantes.SMENSAJE_ESCOJA_OPCION);
				tarjetacredito.setId(null);

				if(!TarjetaCreditoConstantesFunciones.ExisteEnLista(this.tarjetacreditosForeignKey,tarjetacredito,true)) {

					this.tarjetacreditosForeignKey.add(0,tarjetacredito);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTarjetaCreditoDescuento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTarjetaCreditoDescuento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTarjetaCreditoDescuento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoDescuento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento)throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(tarjetacreditodescuento.getid_tarjeta_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTarjetaCreditoDescuento()throws Exception {	
		try {
			
			this.setActualTarjetaCreditoForeignKey(this.tarjetacreditodescuentoConstantesFunciones.getid_tarjeta_credito(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTarjetaCreditoDescuento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTarjetaCreditoDescuento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTarjetaCreditoDescuento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTarjetaCreditoDescuento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTarjetaCreditoDescuento()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTarjetaCreditoDescuento(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTarjetaCreditoDescuento()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getItemCount()>0) {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public TarjetaCreditoDescuentoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean(); 
		this.tarjetacreditodescuentoConstantesFunciones=new TarjetaCreditoDescuentoConstantesFunciones(); 
		this.tarjetacreditodescuentoBean=new TarjetaCreditoDescuento();//(this.tarjetacreditodescuentoConstantesFunciones); 		
		this.tarjetacreditodescuentoReturnGeneral=new TarjetaCreditoDescuentoParameterReturnGeneral(); 
		
		this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTarjetaCreditoDescuento(true);
			
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
			
			this.tarjetacreditodescuentoConstantesFunciones=new TarjetaCreditoDescuentoConstantesFunciones(); 
			this.tarjetacreditodescuentoBean=new TarjetaCreditoDescuento();//this.tarjetacreditodescuentoConstantesFunciones); 			
			this.tarjetacreditodescuentoReturnGeneral=new TarjetaCreditoDescuentoParameterReturnGeneral(); 
		
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Descuento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tarjetacreditodescuento=new TarjetaCreditoDescuento();
			this.tarjetacreditodescuentos = new ArrayList<TarjetaCreditoDescuento>();
			this.tarjetacreditodescuentosAux = new ArrayList<TarjetaCreditoDescuento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic=new TarjetaCreditoDescuentoLogic();
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			//this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTarjetaCreditoDescuento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento);	
					}
					
					if(this.jInternalFrameImportacionTarjetaCreditoDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetaCreditoDescuento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTarjetaCreditoDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTarjetaCreditoDescuento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetaCreditoDescuento);
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setVisible(false);
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento);
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setVisible(false);
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTarjetaCreditoDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTarjetaCreditoDescuento);
					this.jInternalFrameImportacionTarjetaCreditoDescuento.setVisible(false);
					this.jInternalFrameImportacionTarjetaCreditoDescuento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTarjetaCreditoDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTarjetaCreditoDescuento);
					this.jInternalFrameOrderByTarjetaCreditoDescuento.setVisible(false);
					this.jInternalFrameOrderByTarjetaCreditoDescuento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTarjetaCreditoDescuentoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TarjetaCreditoDescuentoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tarjetacreditodescuentoReturnGeneral=new TarjetaCreditoDescuentoParameterReturnGeneral();
			
			this.tarjetacreditodescuentoParameterGeneral=new TarjetaCreditoDescuentoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tarjetacreditodescuentoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetaCreditoDescuentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TarjetaCreditoDescuentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTarjetaCredito=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTarjetaCreditoDescuento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTarjetaCreditoDescuento(false);
			
			this.setPermisosUsuarioTarjetaCreditoDescuento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() 
				|| (this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() && this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTarjetaCreditoDescuentoClasesRelacionadas();
			}
			
			if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTarjetaCreditoDescuentoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTarjetaCreditoDescuento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoDescuento();
			}
			
			if(!this.isPermisoBusquedaTarjetaCreditoDescuento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTarjetaCreditoDescuento,this.isPermisoPaginacionMedioTarjetaCreditoDescuento,this.isPermisoPaginacionTodoTarjetaCreditoDescuento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TarjetaCreditoDescuentoConstantesFunciones.getTiposSeleccionarTarjetaCreditoDescuento());
				
				this.tiposColumnasSelect=TarjetaCreditoDescuentoConstantesFunciones.getTiposSeleccionarTarjetaCreditoDescuento(true);
				
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
			//if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTarjetaCreditoDescuento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTarjetaCreditoDescuento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTarjetaCreditoDescuento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoDescuento() ;
			
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
			this.tarjetacreditoLogic=new TarjetaCreditoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tarjetacreditodescuentoImplementable= (TarjetaCreditoDescuentoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetaCreditoDescuentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tarjetacreditodescuentoImplementableHome= (TarjetaCreditoDescuentoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TarjetaCreditoDescuentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tarjetacreditodescuentos= new ArrayList<TarjetaCreditoDescuento>();
			this.tarjetacreditodescuentosEliminados= new ArrayList<TarjetaCreditoDescuento>();
						
			this.isEsNuevoTarjetaCreditoDescuento=false;
			this.esParaAccionDesdeFormularioTarjetaCreditoDescuento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTarjetaCreditoDescuento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTarjetaCreditoDescuento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TarjetaCreditoDescuentoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTarjetaCreditoDescuento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTarjetaCreditoDescuento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTarjetaCreditoDescuento();
			}
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTarjetaCreditoDescuento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TarjetaCreditoDescuento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTarjetaCreditoDescuento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTarjetaCreditoDescuento")) {
				iIndex=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTarjetaCreditoDescuento();	
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
	
	public void cargarCombosForeignKeyTarjetaCreditoDescuento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTarjetaCreditoDescuento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTarjetaCreditoDescuento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTarjetaCreditoDescuentoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTarjetaCreditoDescuento();
		
		this.cargarCombosFrameForeignKeyTarjetaCreditoDescuento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTarjetaCreditoDescuento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoDescuento();
		}
	}
	
	

	public void cargarCombosForeignKeyTarjetaCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTarjetaCreditoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTarjetaCredito();
				this.cargarCombosFrameTarjetaCreditosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTarjetaCredito(this.tarjetacreditosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTarjetaCreditoDescuentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			
			if(jTableDatosTarjetaCreditoDescuento.getRowCount()>=1) {
				jTableDatosTarjetaCreditoDescuento.removeRowSelectionInterval(0, jTableDatosTarjetaCreditoDescuento.getRowCount()-1);						
			}
			
			this.isEsNuevoTarjetaCreditoDescuento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTarjetaCreditoDescuento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(true);			
			//this.tarjetacreditodescuento=new TarjetaCreditoDescuento();
			//this.tarjetacreditodescuento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento() ;
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoDescuento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tarjetacreditodescuento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);				
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TarjetaCreditoDescuento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTarjetaCreditoDescuento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTarjetaCreditoDescuento.getSelectedRows().length;			
			}
			
			tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTarjetaCreditoDescuento--;			
				//TarjetaCreditoDescuento tarjetacreditodescuentoAux= new TarjetaCreditoDescuento();			
				//tarjetacreditodescuentoAux.setId(this.iIdNuevoTarjetaCreditoDescuento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TarjetaCreditoDescuento tarjetacreditodescuentoOrigen=new TarjetaCreditoDescuento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TarjetaCreditoDescuento tarjetacreditodescuentoOrigen : tarjetacreditodescuentosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tarjetacreditodescuentoOrigen =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tarjetacreditodescuentoOrigen =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTarjetaCreditoDescuento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tarjetacreditodescuento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTarjetaCreditoDescuento(tarjetacreditodescuentoOrigen,this.tarjetacreditodescuento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().add(this.tarjetacreditodescuentoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuentos.add(this.tarjetacreditodescuentoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
				
				this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoDescuento(), this.getIndiceNuevoTarjetaCreditoDescuento());
				
				int iLastRow =  this.jTableDatosTarjetaCreditoDescuento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetaCreditoDescuento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetaCreditoDescuento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();									
		
			TarjetaCreditoDescuento tarjetacreditodescuentoOrigen=new TarjetaCreditoDescuento();
			TarjetaCreditoDescuento tarjetacreditodescuentoDestino=new TarjetaCreditoDescuento();
				
			tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTarjetaCreditoDescuento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tarjetacreditodescuentosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTarjetaCreditoDescuento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoOrigen =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetacreditodescuentoOrigen =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tarjetacreditodescuentoDestino =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tarjetacreditodescuentoDestino =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tarjetacreditodescuentoOrigen =tarjetacreditodescuentosSeleccionados.get(0);
				tarjetacreditodescuentoDestino =tarjetacreditodescuentosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTarjetaCreditoDescuento(tarjetacreditodescuentoOrigen,tarjetacreditodescuentoDestino,true,false);
				
				tarjetacreditodescuentoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tarjetacreditodescuentoDestino,tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tarjetacreditodescuentoDestino,tarjetacreditodescuentos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
				
				//this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoDescuento(), this.getIndiceNuevoTarjetaCreditoDescuento());
				
				int iLastRow =  this.jTableDatosTarjetaCreditoDescuento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTarjetaCreditoDescuento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTarjetaCreditoDescuento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTarjetaCreditoDescuento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(!isVisible);
			this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(!isVisible);
			this.jPanelAccionesTarjetaCreditoDescuento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTarjetaCreditoDescuento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTarjetaCreditoDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTarjetaCreditoDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTarjetaCreditoDescuento();
			
			this.abrirFrameOrderByTarjetaCreditoDescuento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTarjetaCreditoDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTarjetaCreditoDescuento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetaCreditoDescuento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.isMaximum()) {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSize(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.iWidthFormulario,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTarjetaCreditoDescuento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTarjetaCreditoDescuento.isMaximum()) {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jContentPaneDetalleTarjetaCreditoDescuento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jContentPaneDetalleTarjetaCreditoDescuento.getWidth(),TarjetaCreditoDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jContentPaneDetalleTarjetaCreditoDescuento.getWidth(),TarjetaCreditoDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jContentPaneDetalleTarjetaCreditoDescuento.getWidth(),TarjetaCreditoDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setVisible(true);
	        this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTarjetaCreditoDescuento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTarjetaCreditoDescuento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTarjetaCreditoDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoDescuento,false,this);
				} else {
					this.jInternalFrameOrderByTarjetaCreditoDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTarjetaCreditoDescuento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTarjetaCreditoDescuento);
				this.jInternalFrameOrderByTarjetaCreditoDescuento.setVisible(false);
				this.jInternalFrameOrderByTarjetaCreditoDescuento.setSelected(false);
				
				this.jInternalFrameOrderByTarjetaCreditoDescuento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetaCreditoDescuento"));
				
				this.inicializarActualizarBindingTablaOrderByTarjetaCreditoDescuento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTarjetaCreditoDescuento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTarjetaCreditoDescuento==null) {
				
				this.jInternalFrameImportacionTarjetaCreditoDescuento=new ImportacionJInternalFrame(TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTarjetaCreditoDescuento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTarjetaCreditoDescuento);
				this.jInternalFrameImportacionTarjetaCreditoDescuento.setVisible(false);
				this.jInternalFrameImportacionTarjetaCreditoDescuento.setSelected(false);


				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetaCreditoDescuento"));
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetaCreditoDescuento"));
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetaCreditoDescuento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTarjetaCreditoDescuento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento==null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento=new ReporteDinamicoJInternalFrame(TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento);
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setVisible(false);
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoDescuento"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoDescuento"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoDescuento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoDescuento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTarjetaCreditoDescuento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTarjetaCreditoDescuento);
			
	       	this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setVisible(false);
	        this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.dispose();
			//this.jInternalFrameDetalleFormTarjetaCreditoDescuento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTarjetaCreditoDescuento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTarjetaCreditoDescuento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTarjetaCreditoDescuento.setVisible(true);
	        this.jInternalFrameImportacionTarjetaCreditoDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTarjetaCreditoDescuento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setVisible(true);
	        this.jInternalFrameOrderByTarjetaCreditoDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTarjetaCreditoDescuento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTarjetaCreditoDescuento.setVisible(false);
	        this.jInternalFrameOrderByTarjetaCreditoDescuento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTarjetaCreditoDescuento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTarjetaCreditoDescuento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTarjetaCreditoDescuento.setVisible(false);
	        this.jInternalFrameImportacionTarjetaCreditoDescuento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTarjetaCreditoDescuento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTarjetaCreditoDescuento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(true);
			//this.isEsNuevoTarjetaCreditoDescuento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false) ;
			
			if(tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoDescuento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTarjetaCreditoDescuentoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTarjetaCreditoDescuento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(true);
			//this.isEsNuevoTarjetaCreditoDescuento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tarjetacreditodescuento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false) ;
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTarjetaCreditoDescuento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTarjetaCredito(List<TarjetaCredito> tarjetacreditosForeignKey)throws Exception{
		TableColumn tableColumnTarjetaCredito=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO));
		TableCellEditor tableCellEditorTarjetaCredito =tableColumnTarjetaCredito.getCellEditor();

		TarjetaCreditoTableCell tarjetacreditoTableCellFk=(TarjetaCreditoTableCell)tableCellEditorTarjetaCredito;

		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.settarjetacreditosForeignKey(tarjetacreditosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tarjetacreditoTableCellFk.setRowActual(intSelectedRow);
			//tarjetacreditoTableCellFk.settarjetacreditosForeignKeyActual(tarjetacreditosForeignKey);
		//}


		if(tarjetacreditoTableCellFk!=null) {
			tarjetacreditoTableCellFk.RecargarTarjetaCreditosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTarjetaCreditoDescuento(false);
			
			//if(!this.isEsNuevoTarjetaCreditoDescuento) {								
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				
			}
			
			if(this.permiteMantenimiento(this.tarjetacreditodescuento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTarjetaCreditoDescuento=true;
					this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
					this.isEsNuevoTarjetaCreditoDescuento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTarjetaCreditoDescuento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTarjetaCreditoDescuento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(false);
				
				this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(false);
			
												
				
				if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTarjetaCreditoDescuento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,tarjetacreditodescuentoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tarjetacreditodescuentoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tarjetacreditodescuento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				this.tarjetacreditodescuento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				this.tarjetacreditodescuento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tarjetacreditodescuento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TarjetaCreditoDescuentoModel) this.jTableDatosTarjetaCreditoDescuento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTarjetaCreditoDescuento=true;
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
				this.isEsNuevoTarjetaCreditoDescuento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(false);
				
				this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(false);
				
				
				
				if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTarjetaCreditoDescuento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTarjetaCreditoDescuento.getRowCount()>=1) {
				jTableDatosTarjetaCreditoDescuento.removeRowSelectionInterval(0, jTableDatosTarjetaCreditoDescuento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTarjetaCreditoDescuento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(false) ;
			
			this.isEsNuevoTarjetaCreditoDescuento=false;
			
			if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTarjetaCreditoDescuento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				
				//SI ES MANUAL
				if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTarjetaCreditoDescuento--;			
			//TarjetaCreditoDescuento tarjetacreditodescuentoAux= new TarjetaCreditoDescuento();			
			//tarjetacreditodescuentoAux.setId(this.iIdNuevoTarjetaCreditoDescuento);
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTarjetaCreditoDescuento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
			
			this.tarjetacreditodescuento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().add(this.tarjetacreditodescuentoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tarjetacreditodescuentos.add(this.tarjetacreditodescuentoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			
			this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(this.getIndiceNuevoTarjetaCreditoDescuento(), this.getIndiceNuevoTarjetaCreditoDescuento());
			
			int iLastRow =  this.jTableDatosTarjetaCreditoDescuento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTarjetaCreditoDescuento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTarjetaCreditoDescuento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();
			}
			
			//this.abrirFrameTreeTarjetaCreditoDescuento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tarjeta Credito DescuentoS ?", "MANTENIMIENTO DE Tarjeta Credito Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTarjetaCreditoDescuento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTarjetaCreditoDescuento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.procesarImportacionTarjetaCreditoDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tarjetacreditodescuentoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTarjetaCreditoDescuentoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTarjetaCreditoDescuento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTarjetaCreditoDescuento.setFileImportacion(this.jInternalFrameImportacionTarjetaCreditoDescuento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTarjetaCreditoDescuento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTarjetaCreditoDescuento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		

		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TarjetaCreditoDescuentoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TarjetaCreditoDescuentoBaseDesign.jrxml";
			
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
			
			this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TarjetaCredito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TarjetaCredito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TarjetaCredito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TarjetaCredito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMeses_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMeses_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMeses_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMeses_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Corriente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Corriente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Corriente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Corriente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nInteres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nInteres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nInteres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nInteres_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoria="id_tarjeta_credito";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoria="numero_meses";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE:
					sNombreCampoCategoria="es_corriente";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES:
					sNombreCampoCategoria="con_interes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO:
					sNombreCampoCategoriaValor="id_tarjeta_credito";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoriaValor="numero_meses";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE:
					sNombreCampoCategoriaValor="es_corriente";
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES:
					sNombreCampoCategoriaValor="con_interes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tarjeta Credito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tarjeta_credito");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Meses",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_meses");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Corriente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_corriente");
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_interes");
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
	
	public void jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TarjetaCreditoDescuentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.gettarjetacredito_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getnumero_meses());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getes_corriente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES);
					iRow++;

					for(TarjetaCreditoDescuento tarjetacreditodescuento:tarjetacreditodescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tarjetacreditodescuento.getcon_interes());
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
			//	this.getFilaCabeceraExportarExcelTarjetaCreditoDescuento(row);				
			//	iRow++;
			//}				
			
			//for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTarjetaCreditoDescuento(tarjetacreditodescuentoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
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
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
			
			//SI ES MANUAL
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTarjetaCreditoDescuento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTarjetaCreditoDescuento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTarjetaCreditoDescuento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTarjetaCreditoDescuento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTarjetaCreditoDescuento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTarjetaCreditoDescuento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTarjetaCreditoDescuento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTarjetaCreditoDescuento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTarjetaCreditoDescuento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTarjetaCreditoDescuento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTarjetaCreditoDescuento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTarjetaCreditoDescuento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTarjetaCreditoDescuento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoDescuento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTarjetaCreditoDescuento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTarjetaCreditoDescuento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTarjetaCreditoDescuento();
		
		this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetaCreditoDescuento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoDescuento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoDescuento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoDescuento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTarjetaCreditoDescuento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTarjetaCreditoDescuento(Boolean esInicializar) throws Exception {
		try	{	
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTarjetaCreditoDescuento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTarjetaCreditoDescuento() throws Exception {
		try	{
			if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetaCreditoDescuento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetaCreditoDescuento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTarjetaCreditoDescuento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTarjetaCreditoDescuento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTarjetaCreditoDescuento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTarjetaCreditoDescuento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.addItem(reporte);
			}
			
			
			if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTarjetaCreditoDescuento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTarjetaCreditoDescuento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoDescuento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTarjetaCreditoDescuento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TarjetaCreditoDescuentoConstantesFunciones.getTiposSeleccionarTarjetaCreditoDescuento(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TarjetaCreditoDescuentoConstantesFunciones.getTiposSeleccionarTarjetaCreditoDescuento(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TarjetaCreditoDescuentoConstantesFunciones.getTiposSeleccionarTarjetaCreditoDescuento(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTarjetaCreditoDescuento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.getSelectedItem()!=null){this.id_tarjeta_creditoFK_IdTarjetaCredito=((TarjetaCredito)this.jComboBoxid_tarjeta_creditoFK_IdTarjetaCreditoTarjetaCreditoDescuento.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTarjetaCreditoDescuento(Boolean esInicializar) throws Exception {				
		if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTarjetaCreditoDescuento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTarjetaCreditoDescuento() throws Exception {
		this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTarjetaCreditoDescuento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTarjetaCreditoDescuentoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuentoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTarjetaCreditoDescuento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tarjetacreditodescuentos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTarjetaCreditoDescuento.setModel(new TarjetaCreditoDescuentoModel(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTarjetaCreditoDescuento.setModel(new TarjetaCreditoDescuentoModel(this.tarjetacreditodescuentos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTarjetaCreditoDescuento!=null && this.jInternalFrameOrderByTarjetaCreditoDescuento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTarjetaCreditoDescuento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,tarjetacreditodescuentoConstantesFunciones.resaltarSeleccionarTarjetaCreditoDescuento,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO,tarjetacreditodescuentoConstantesFunciones.resaltarSeleccionarTarjetaCreditoDescuento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostraridTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltaridTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activaridTarjetaCreditoDescuento,iSizeTabla,this,true,"idTarjetaCreditoDescuento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltaridTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activaridTarjetaCreditoDescuento,this,true,"idTarjetaCreditoDescuento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_empresaTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_empresaTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_empresaTarjetaCreditoDescuento,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_empresaTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_empresaTarjetaCreditoDescuento,false,"id_empresaTarjetaCreditoDescuento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_sucursalTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_sucursalTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_sucursalTarjetaCreditoDescuento,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_sucursalTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_sucursalTarjetaCreditoDescuento,false,"id_sucursalTarjetaCreditoDescuento","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TarjetaCreditoTableCell(this.tarjetacreditosForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoDescuento,iSizeTabla));
			tableColumn.setCellEditor(new TarjetaCreditoTableCell(this.tarjetacreditosForeignKey,this.tarjetacreditodescuentoConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoDescuento,this,this.tarjetacreditodescuentoConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoDescuento,true,"id_tarjeta_creditoTarjetaCreditoDescuento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarporcentajeTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarporcentajeTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarporcentajeTarjetaCreditoDescuento,iSizeTabla,this,true,"porcentajeTarjetaCreditoDescuento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarporcentajeTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarporcentajeTarjetaCreditoDescuento,this,true,"porcentajeTarjetaCreditoDescuento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarnumero_mesesTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarnumero_mesesTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarnumero_mesesTarjetaCreditoDescuento,iSizeTabla,this,true,"numero_mesesTarjetaCreditoDescuento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarnumero_mesesTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarnumero_mesesTarjetaCreditoDescuento,this,true,"numero_mesesTarjetaCreditoDescuento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrares_corrienteTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltares_corrienteTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activares_corrienteTarjetaCreditoDescuento,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltares_corrienteTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activares_corrienteTarjetaCreditoDescuento,this,true,"es_corrienteTarjetaCreditoDescuento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES));

		if(this.tarjetacreditodescuentoConstantesFunciones.mostrarcon_interesTarjetaCreditoDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarcon_interesTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarcon_interesTarjetaCreditoDescuento,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tarjetacreditodescuentoConstantesFunciones.resaltarcon_interesTarjetaCreditoDescuento,this.tarjetacreditodescuentoConstantesFunciones.activarcon_interesTarjetaCreditoDescuento,this,true,"con_interesTarjetaCreditoDescuento","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TarjetaCreditoDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetaCreditoDescuento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTarjetaCreditoDescuento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTarjetaCreditoDescuento.addColumn(tableColumn);
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
			
			this.jTableDatosTarjetaCreditoDescuento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTarjetaCreditoDescuento.moveColumn(this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTarjetaCreditoDescuento.moveColumn(this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTarjetaCreditoDescuento.moveColumn(this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTarjetaCreditoDescuento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTarjetaCreditoDescuento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTarjetaCreditoDescuento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTarjetaCreditoDescuento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTarjetaCreditoDescuento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTarjetaCreditoDescuento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tarjetacreditodescuentos.size()-1;
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
		//this.jTableDatosTarjetaCreditoDescuento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTarjetaCreditoDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTarjetaCreditoDescuento();
			
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
				
				//this.isEsNuevoTarjetaCreditoDescuento=false;
					
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
				if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetaCreditoDescuento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tarjetacreditodescuento.getsType().equals("DUPLICADO")
				   || this.tarjetacreditodescuento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTarjetaCreditoDescuento=true;
				
				} else {
					this.isEsNuevoTarjetaCreditoDescuento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					if(this.tarjetacreditodescuento.getId()>=0 && !this.tarjetacreditodescuento.getIsNew()) {						
						this.isEsNuevoTarjetaCreditoDescuento=false;
						
					} else {
						this.isEsNuevoTarjetaCreditoDescuento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTarjetaCreditoDescuento(esRelaciones);						
				
				this.seleccionarTarjetaCreditoDescuento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tarjetacreditodescuento.getId()<0) {
					this.isEsNuevoTarjetaCreditoDescuento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTarjetaCreditoDescuento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTarjetaCreditoDescuento(evt,rowIndex);
				}	
				
				if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TarjetaCreditoDescuento: " + this.dDif); 
					}
				}								
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTarjetaCreditoDescuento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tarjetacreditodescuento)) {
					if(this.tarjetacreditodescuento.getId()>0) {
						this.tarjetacreditodescuento.setIsDeleted(true);
						
						this.tarjetacreditodescuentosEliminados.add(this.tarjetacreditodescuento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().remove(this.tarjetacreditodescuento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuentos.remove(this.tarjetacreditodescuento);				
					}
					
					
					((TarjetaCreditoDescuentoModel) this.jTableDatosTarjetaCreditoDescuento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTarjetaCreditoDescuento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTarjetaCreditoDescuento) {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTarjetaCreditoDescuento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tarjetacreditodescuentoConstantesFunciones.cargarid_empresaTarjetaCreditoDescuento || this.tarjetacreditodescuentoConstantesFunciones.event_dependid_empresaTarjetaCreditoDescuento) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tarjetacreditodescuento.getid_empresa());
									//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tarjetacreditodescuento.getEmpresa()!=null) {
							this.empresasForeignKey.add(tarjetacreditodescuento.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tarjetacreditodescuento.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.tarjetacreditodescuentoConstantesFunciones.cargarid_sucursalTarjetaCreditoDescuento || this.tarjetacreditodescuentoConstantesFunciones.event_dependid_sucursalTarjetaCreditoDescuento) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.tarjetacreditodescuento.getid_sucursal());
									//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(tarjetacreditodescuento.getSucursal()!=null) {
							this.sucursalsForeignKey.add(tarjetacreditodescuento.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.tarjetacreditodescuento.getid_sucursal(),false,"Formulario");

					//TarjetaCredito
					if(!this.tarjetacreditodescuentoConstantesFunciones.cargarid_tarjeta_creditoTarjetaCreditoDescuento || this.tarjetacreditodescuentoConstantesFunciones.event_dependid_tarjeta_creditoTarjetaCreditoDescuento) {
						//this.cargarCombosTarjetaCreditosForeignKeyLista(" where id="+this.tarjetacreditodescuento.getid_tarjeta_credito());
									//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
						this.tarjetacreditosForeignKey=new ArrayList<TarjetaCredito>();

						if(tarjetacreditodescuento.getTarjetaCredito()!=null) {
							this.tarjetacreditosForeignKey.add(tarjetacreditodescuento.getTarjetaCredito());
						}

						this.addItemDefectoCombosForeignKeyTarjetaCredito();
						this.cargarCombosFrameTarjetaCreditosForeignKey("Todos");
					}
					this.setActualTarjetaCreditoForeignKey(this.tarjetacreditodescuento.getid_tarjeta_credito(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTarjetaCreditoDescuento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTarjetaCreditoDescuento(tarjetacreditodescuento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(tarjetacreditodescuento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTarjetaCreditoDescuento(tarjetacreditodescuento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoDescuento(tarjetacreditodescuento);
	}
	
	public void setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getId().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getporcentaje().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getnumero_meses().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setSelected(tarjetacreditodescuento.getes_corriente());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setSelected(tarjetacreditodescuento.getcon_interes());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TarjetaCreditoDescuento tarjetacreditodescuentoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tarjetacreditodescuentoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TarjetaCreditoDescuento tarjetacreditodescuentoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tarjetacreditodescuentoLocal=this.tarjetacreditodescuento;
			} else {
				tarjetacreditodescuentoLocal=this.tarjetacreditodescuentoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tarjetacreditodescuentoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTarjetaCreditoDescuento(tarjetacreditodescuentoLocal,true);
					
					if(tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tarjetacreditodescuentoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tarjetacreditodescuentoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(tarjetacreditodescuento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(tarjetacreditodescuento);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(tarjetacreditodescuento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.getText()==null || this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.getText()=="" || this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.getText()=="Id") {
				this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setText("0");
			}

			if(conColumnasBase) {tarjetacreditodescuento.setId(Long.parseLong(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelIdTarjetaCreditoDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetacreditodescuento.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelporcentajeTarjetaCreditoDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetacreditodescuento.setnumero_meses(Integer.parseInt(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelnumero_mesesTarjetaCreditoDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetacreditodescuento.setes_corriente(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabeles_corrienteTarjetaCreditoDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tarjetacreditodescuento.setcon_interes(this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelcon_interesTarjetaCreditoDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuentoBean,TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tarjetacreditodescuentoBean.getid_tarjeta_credito()!=null && !tarjetacreditodescuentoBean.getid_tarjeta_credito().equals(-1L))) {tarjetacreditodescuento.setid_tarjeta_credito(tarjetacreditodescuentoBean.getid_tarjeta_credito());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuentoOrigen,TarjetaCreditoDescuento tarjetacreditodescuento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getId()!=null && !tarjetacreditodescuentoOrigen.getId().equals(0L))) {tarjetacreditodescuento.setId(tarjetacreditodescuentoOrigen.getId());}}
			if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getid_tarjeta_credito()!=null && !tarjetacreditodescuentoOrigen.getid_tarjeta_credito().equals(-1L))) {tarjetacreditodescuento.setid_tarjeta_credito(tarjetacreditodescuentoOrigen.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getporcentaje()!=null && !tarjetacreditodescuentoOrigen.getporcentaje().equals(0.0))) {tarjetacreditodescuento.setporcentaje(tarjetacreditodescuentoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getnumero_meses()!=null && !tarjetacreditodescuentoOrigen.getnumero_meses().equals(0))) {tarjetacreditodescuento.setnumero_meses(tarjetacreditodescuentoOrigen.getnumero_meses());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getes_corriente()!=null && !tarjetacreditodescuentoOrigen.getes_corriente().equals(false))) {tarjetacreditodescuento.setes_corriente(tarjetacreditodescuentoOrigen.getes_corriente());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoOrigen.getcon_interes()!=null && !tarjetacreditodescuentoOrigen.getcon_interes().equals(false))) {tarjetacreditodescuento.setcon_interes(tarjetacreditodescuentoOrigen.getcon_interes());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getId().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getporcentaje().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setText(tarjetacreditodescuento.getnumero_meses().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setSelected(tarjetacreditodescuento.getes_corriente());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setSelected(tarjetacreditodescuento.getcon_interes());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTarjetaCreditoDescuento(TarjetaCreditoDescuentoBean tarjetacreditodescuentoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setText(tarjetacreditodescuentoBean.getId().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setText(tarjetacreditodescuentoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setText(tarjetacreditodescuentoBean.getnumero_meses().toString());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setSelected(tarjetacreditodescuentoBean.getes_corriente());
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setSelected(tarjetacreditodescuentoBean.getcon_interes());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTarjetaCreditoDescuento(TarjetaCreditoDescuentoParameterReturnGeneral tarjetacreditodescuentoReturnGeneral,TarjetaCreditoDescuentoBean tarjetacreditodescuentoBean,Boolean conDefault) throws Exception { 
		try {
			TarjetaCreditoDescuento tarjetacreditodescuentoLocal=new TarjetaCreditoDescuento();
			
			tarjetacreditodescuentoLocal=tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getId()!=null && !tarjetacreditodescuentoLocal.getId().equals(0L))) {tarjetacreditodescuentoBean.setId(tarjetacreditodescuentoLocal.getId());}}
			if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getid_tarjeta_credito()!=null && !tarjetacreditodescuentoLocal.getid_tarjeta_credito().equals(-1L))) {tarjetacreditodescuentoBean.setid_tarjeta_credito(tarjetacreditodescuentoLocal.getid_tarjeta_credito());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getporcentaje()!=null && !tarjetacreditodescuentoLocal.getporcentaje().equals(0.0))) {tarjetacreditodescuentoBean.setporcentaje(tarjetacreditodescuentoLocal.getporcentaje());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getnumero_meses()!=null && !tarjetacreditodescuentoLocal.getnumero_meses().equals(0))) {tarjetacreditodescuentoBean.setnumero_meses(tarjetacreditodescuentoLocal.getnumero_meses());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getes_corriente()!=null && !tarjetacreditodescuentoLocal.getes_corriente().equals(false))) {tarjetacreditodescuentoBean.setes_corriente(tarjetacreditodescuentoLocal.getes_corriente());}
			if(conDefault || (!conDefault && tarjetacreditodescuentoLocal.getcon_interes()!=null && !tarjetacreditodescuentoLocal.getcon_interes().equals(false))) {tarjetacreditodescuentoBean.setcon_interes(tarjetacreditodescuentoLocal.getcon_interes());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTarjetaCreditoDescuentoGenerico(Long idTarjetaCreditoDescuentoSeleccionado,JComboBox jComboBoxTarjetaCreditoDescuento,List<TarjetaCreditoDescuento> tarjetacreditodescuentosLocal)throws Exception {
		try {
			TarjetaCreditoDescuento  tarjetacreditodescuentoTemp=null;

			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosLocal) {
				if(tarjetacreditodescuentoAux.getId()!=null && tarjetacreditodescuentoAux.getId().equals(idTarjetaCreditoDescuentoSeleccionado)) {
					tarjetacreditodescuentoTemp=tarjetacreditodescuentoAux;
					break;
				}
			}

			jComboBoxTarjetaCreditoDescuento.setSelectedItem(tarjetacreditodescuentoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTarjetaCreditoDescuentoGenerico(JComboBox jComboBoxTarjetaCreditoDescuento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetaCreditoDescuento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTarjetaCreditoDescuento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTarjetaCreditoDescuento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTarjetaCreditoDescuento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditodescuento=(TarjetaCreditoDescuento) tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetacreditodescuento =(TarjetaCreditoDescuento) tarjetacreditodescuentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tarjetacreditodescuento.getIsNew() && !tarjetacreditodescuento.getIsChanged() && !tarjetacreditodescuento.getIsDeleted()) {
				sDescripcion=tarjetacreditodescuento.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditodescuento.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tarjetacreditodescuento.getIsNew() && !tarjetacreditodescuento.getIsChanged() && !tarjetacreditodescuento.getIsDeleted()) {
				sDescripcion=tarjetacreditodescuento.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditodescuento.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TarjetaCredito")) {
			//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
			if(!tarjetacreditodescuento.getIsNew() && !tarjetacreditodescuento.getIsChanged() && !tarjetacreditodescuento.getIsDeleted()) {
				sDescripcion=tarjetacreditodescuento.gettarjetacredito_descripcion();
			} else {
				//sDescripcion=this.getActualTarjetaCreditoForeignKeyDescripcion((Long)value);
				sDescripcion=tarjetacreditodescuento.gettarjetacredito_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TarjetaCreditoDescuento tarjetacreditodescuentoRow=new TarjetaCreditoDescuento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditodescuentoRow=(TarjetaCreditoDescuento) tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tarjetacreditodescuentoRow=(TarjetaCreditoDescuento) tarjetacreditodescuentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));			
			this.jButtonDuplicarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento && this.isPermisoDuplicarTarjetaCreditoDescuento));			
			this.jButtonCopiarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento && this.isPermisoCopiarTarjetaCreditoDescuento));
			this.jButtonVerFormTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento && this.isPermisoVerFormTarjetaCreditoDescuento));
			
			this.jButtonAbrirOrderByTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));			
			
			this.jButtonNuevoRelacionesTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));			
			this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoDescuento && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento && this.isPermisoEliminarTarjetaCreditoDescuento));
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento);							
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));						
			this.jButtonDuplicarToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento && this.isPermisoDuplicarTarjetaCreditoDescuento));						
			this.jButtonCopiarToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento && this.isPermisoCopiarTarjetaCreditoDescuento));			
			this.jButtonVerFormToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento && this.isPermisoVerFormTarjetaCreditoDescuento));			
			this.jButtonAbrirOrderByToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));
			this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));			
			this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));			
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoDescuento && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento  && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento && this.isPermisoEliminarTarjetaCreditoDescuento));
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarToolBarTarjetaCreditoDescuento.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento);				
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));			
			this.jMenuItemDuplicarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento && this.isPermisoDuplicarTarjetaCreditoDescuento));			
			this.jMenuItemCopiarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento && this.isPermisoCopiarTarjetaCreditoDescuento));			
			this.jMenuItemVerFormTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento && this.isPermisoVerFormTarjetaCreditoDescuento));			
			this.jMenuItemAbrirOrderByTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));			
			//this.jMenuItemMostrarOcultarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));
			this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));			
			//this.jMenuItemDetalleMostrarOcultarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento && this.isPermisoOrdenTarjetaCreditoDescuento));			
			this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento));			
			this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento && this.isPermisoNuevoTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));									
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemModificarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaModificarTarjetaCreditoDescuento && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemActualizarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento && this.isPermisoActualizarTarjetaCreditoDescuento));	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemEliminarTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento && this.isPermisoEliminarTarjetaCreditoDescuento));
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemCancelarTarjetaCreditoDescuento.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento);				
			}
			
			this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));						
			this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=this.jButtonNuevoTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento=this.jButtonDuplicarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento=this.jButtonCopiarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento=this.jButtonVerFormTarjetaCreditoDescuento.isVisible();
			
			this.isVisibilidadCeldaOrdenTarjetaCreditoDescuento=this.jButtonAbrirOrderByTarjetaCreditoDescuento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=this.jButtonNuevoRelacionesTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=this.jButtonModificarTarjetaCreditoDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=this.jButtonNuevoToolBarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarToolBarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarToolBarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarToolBarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarToolBarTarjetaCreditoDescuento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=this.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=this.jMenuItemNuevoTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemModificarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemActualizarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemEliminarTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemCancelarTarjetaCreditoDescuento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTarjetaCreditoDescuento(Boolean esInicializar) {
		if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
				//if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetaCreditoDescuento();
			}
			
			this.inicializarActualizarBindingBotonesManualTarjetaCreditoDescuento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoDescuento() {
		this.jButtonNuevoTarjetaCreditoDescuento.setVisible(this.isPermisoNuevoTarjetaCreditoDescuento);			
		this.jButtonDuplicarTarjetaCreditoDescuento.setVisible(this.isPermisoDuplicarTarjetaCreditoDescuento);			
		this.jButtonCopiarTarjetaCreditoDescuento.setVisible(this.isPermisoCopiarTarjetaCreditoDescuento);			
		this.jButtonVerFormTarjetaCreditoDescuento.setVisible(this.isPermisoVerFormTarjetaCreditoDescuento);			
		
		this.jButtonAbrirOrderByTarjetaCreditoDescuento.setVisible(this.isPermisoOrdenTarjetaCreditoDescuento);					
		
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.setVisible(this.isPermisoNuevoTarjetaCreditoDescuento);			
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarTarjetaCreditoDescuento.setVisible(this.isPermisoActualizarTarjetaCreditoDescuento);	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.setVisible(this.isPermisoActualizarTarjetaCreditoDescuento);	
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.setVisible(this.isPermisoEliminarTarjetaCreditoDescuento);
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento);						
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.setVisible(this.isPermisoGuardarCambiosTarjetaCreditoDescuento);							
		}
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setVisible(this.isPermisoActualizarTarjetaCreditoDescuento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetaCreditoDescuento() {
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarTarjetaCreditoDescuento.setVisible(this.isPermisoActualizarTarjetaCreditoDescuento);	
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.setVisible(this.isPermisoActualizarTarjetaCreditoDescuento);	
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.setVisible(this.isPermisoEliminarTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.setVisible(this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento);							
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.setVisible((this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento && this.isPermisoGuardarCambiosTarjetaCreditoDescuento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTarjetaCreditoDescuento() {
		if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTarjetaCreditoDescuento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTarjetaCreditoDescuento() {
	}
	
	public void jTableDatosTarjetaCreditoDescuentoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTarjetaCreditoDescuento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tarjetacreditodescuento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTarjetaCreditoDescuentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoDescuento(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoDescuento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tarjetacreditodescuentoLogic.getConnexion());

				if(this.tarjetacreditodescuento.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tarjetacreditodescuento.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoDescuento=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoDescuento.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTarjetaCreditoDescuento.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tarjetacreditodescuento.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTarjetaCreditoDescuentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoDescuento(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoDescuento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tarjetacreditodescuentoLogic.getConnexion());

				if(this.tarjetacreditodescuento.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tarjetacreditodescuento.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoDescuento=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoDescuento.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTarjetaCreditoDescuento.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tarjetacreditodescuento.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotarjetacredito=true;

			idTienePermisotarjetacredito=this.tienePermisosUsuarioEnPaginaWebTarjetaCreditoDescuento(TarjetaCreditoConstantesFunciones.CLASSNAME);

			if(idTienePermisotarjetacredito) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTarjetaCreditoDescuento.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTarjetaCreditoDescuento.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.tarjetacreditodescuentoLogic.getConnexion());

				if(this.tarjetacreditodescuento.getid_tarjeta_credito()!=null) {
					this.tarjetacreditoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tarjetacreditoBeanSwingJInternalFrame.setIdActual(this.tarjetacreditodescuento.getid_tarjeta_credito());
					this.tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito();
				}

				JInternalFrameBase jinternalFrame =this.tarjetacreditoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTarjetaCreditoDescuento=(TitledBorder)this.jScrollPanelDatosTarjetaCreditoDescuento.getBorder();
				TitledBorder titledBordertarjetacredito=(TitledBorder)this.tarjetacreditoBeanSwingJInternalFrame.jScrollPanelDatosTarjetaCredito.getBorder();

				titledBordertarjetacredito.setTitle(titledBorderTarjetaCreditoDescuento.getTitle() + " -> Tarjeta Credito");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getid_tarjeta_credito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tarjeta_credito = "+this.tarjetacreditodescuento.getid_tarjeta_credito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.tarjetacreditodescuento.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mesesTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getnumero_meses()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_meses = "+this.tarjetacreditodescuento.getnumero_meses().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_corrienteTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getes_corriente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_corriente = "+this.tarjetacreditodescuento.getes_corriente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_interesTarjetaCreditoDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.gettarjetacreditodescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tarjetacreditodescuento==null) {
						this.tarjetacreditodescuento = new TarjetaCreditoDescuento();
					}

					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);
				}

				if(this.tarjetacreditodescuento.getcon_interes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_interes = "+this.tarjetacreditodescuento.getcon_interes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);

			this.getTarjetaCreditoDescuentosFK_IdEmpresa();

			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);

			//if(TarjetaCreditoDescuentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);

			this.getTarjetaCreditoDescuentosFK_IdSucursal();

			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);

			//if(TarjetaCreditoDescuentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);

			this.getTarjetaCreditoDescuentosFK_IdTarjetaCredito();

			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);

			//if(TarjetaCreditoDescuentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tarjetacreditodescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTarjetaCreditoDescuento() {
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.dispose();
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
			this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.dispose();
			this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento=null;
		}
		
		if(this.jInternalFrameImportacionTarjetaCreditoDescuento!=null) {
			this.jInternalFrameImportacionTarjetaCreditoDescuento.setVisible(false);	    			
			this.jInternalFrameImportacionTarjetaCreditoDescuento.dispose();
			this.jInternalFrameImportacionTarjetaCreditoDescuento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTarjetaCreditoDescuento();
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTarjetaCreditoDescuento")) {
				jButtonDuplicarTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTarjetaCreditoDescuento")) {
				jButtonCopiarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTarjetaCreditoDescuento")) {
				jButtonVerFormTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTarjetaCreditoDescuento")) {
				jButtonDuplicarTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTarjetaCreditoDescuento")) {
				jButtonDuplicarTarjetaCreditoDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTarjetaCreditoDescuento")) {
				jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTarjetaCreditoDescuento")) {
				jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTarjetaCreditoDescuento")) {
				jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTarjetaCreditoDescuento")) {
				jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTarjetaCreditoDescuento")) {
				jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTarjetaCreditoDescuento")) {
				jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTarjetaCreditoDescuento")) {
				jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTarjetaCreditoDescuento")) {
				jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTarjetaCreditoDescuento")) {
				jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTarjetaCreditoDescuento")) {
				jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTarjetaCreditoDescuento")) {
				jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTarjetaCreditoDescuento")) {
				jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTarjetaCreditoDescuento")) {
				jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTarjetaCreditoDescuento")) {
				jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTarjetaCreditoDescuento")) {
				jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTarjetaCreditoDescuento")) {
				jButtonMostrarOcultarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTarjetaCreditoDescuento")) {
				jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTarjetaCreditoDescuento")) {
				jButtonCopiarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTarjetaCreditoDescuento")) {
				jButtonVerFormTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTarjetaCreditoDescuento")) {
				jButtonCopiarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTarjetaCreditoDescuento")) {
				jButtonVerFormTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTarjetaCreditoDescuento")) {
				jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTarjetaCreditoDescuento")) {
				jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTarjetaCreditoDescuento")) {
				jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTarjetaCreditoDescuento")) {
				jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTarjetaCreditoDescuento")) {
				jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTarjetaCreditoDescuento")) {
				jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTarjetaCreditoDescuento")) {
				jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTarjetaCreditoDescuento")) {
				jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTarjetaCreditoDescuento")) {
				jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTarjetaCreditoDescuento") || sTipo.equals("MenuItemDetalleAbrirOrderByTarjetaCreditoDescuento")) {
				jButtonAbrirOrderByTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTarjetaCreditoDescuento") || sTipo.equals("MenuItemDetalleMostrarOcultarTarjetaCreditoDescuento")) {
				jButtonMostrarOcultarTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetaCreditoDescuento")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTarjetaCreditoDescuento")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTarjetaCreditoDescuento")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTarjetaCreditoDescuento")) {
				jButtonCerrarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTarjetaCreditoDescuento")) {
				jButtonGenerarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTarjetaCreditoDescuento")) {
				
				jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTarjetaCreditoDescuento")) {
				jButtonCerrarImportacionTarjetaCreditoDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTarjetaCreditoDescuento")) {
				
				jButtonGenerarImportacionTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTarjetaCreditoDescuento")) {
				
				jButtonAbrirImportacionTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTarjetaCreditoDescuento")) {
				jComboBoxTiposAccionesTarjetaCreditoDescuentoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTarjetaCreditoDescuento")) {
				jComboBoxTiposRelacionesTarjetaCreditoDescuentoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTarjetaCreditoDescuento")) {
				jComboBoxTiposAccionesTarjetaCreditoDescuentoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTarjetaCreditoDescuento")) {
				
				jComboBoxTiposSeleccionarTarjetaCreditoDescuentoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTarjetaCreditoDescuento")) {
				jTextFieldValorCampoGeneralTarjetaCreditoDescuentoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTarjetaCreditoDescuento")) {
				jButtonAbrirOrderByTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTarjetaCreditoDescuento")) {
				jButtonAbrirOrderByTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTarjetaCreditoDescuento")) {
				jButtonCerrarOrderByTarjetaCreditoDescuentoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonidTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_empresaTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_empresaTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_sucursalTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_sucursalTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonporcentajeTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonnumero_mesesTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_corrienteTarjetaCreditoDescuentoBusqueda")) {
				this.jButtones_corrienteTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_interesTarjetaCreditoDescuentoBusqueda")) {
				this.jButtoncon_interesTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTarjetaCreditoTarjetaCreditoDescuento")) {
				this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuentoActionPerformed(evt);
			}
			
			;
			
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTarjetaCreditoDescuento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TarjetaCreditoDescuento tarjetacreditodescuentoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tarjetacreditodescuentoLocal=this.tarjetacreditodescuento;
			} else {
				tarjetacreditodescuentoLocal=this.tarjetacreditodescuentoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
							
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
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
			
			


			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
								
						
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
								
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
							
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
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
			
			


			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
								
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTarjetaCreditoDescuento")) {
					jCheckBoxSeleccionarTodosTarjetaCreditoDescuentoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTarjetaCreditoDescuento")) {
					jCheckBoxSeleccionadosTarjetaCreditoDescuentoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTarjetaCreditoDescuento")) {
					
				}
				
				


				
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
												
				
				


				
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
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
			
			


			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tarjetacreditodescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tarjetacreditodescuento);
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
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
				
				


				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TarjetaCreditoDescuento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TarjetaCreditoDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTarjetaCreditoDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tarjetacreditodescuentoAnterior =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTarjetaCreditoDescuento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTarjetaCreditoDescuentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTarjetaCreditoDescuento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tarjetacreditodescuento =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tarjetacreditodescuento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTarjetaCreditoDescuento")) {
				
				}
				
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTarjetaCreditoDescuento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTarjetaCreditoDescuento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTarjetaCreditoDescuento")) {
			
			}
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTarjetaCreditoDescuento();
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			if(sTipo.equals("NuevoTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTarjetaCreditoDescuento")) {
				jButtonDuplicarTarjetaCreditoDescuentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTarjetaCreditoDescuento")) {
				jButtonCopiarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTarjetaCreditoDescuento")) {
				jButtonVerFormTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTarjetaCreditoDescuento")) {
				jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTarjetaCreditoDescuento")) {
				jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTarjetaCreditoDescuento")) {
				jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTarjetaCreditoDescuento")) {
				jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTarjetaCreditoDescuento")) {
				jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTarjetaCreditoDescuento")) {
				jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTarjetaCreditoDescuento")) {
				jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTarjetaCreditoDescuento")) {
				jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTarjetaCreditoDescuento")) {
				jButtonAbrirOrderByTarjetaCreditoDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTarjetaCreditoDescuento")) {
				jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTarjetaCreditoDescuento")) {
				jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTarjetaCreditoDescuento")) {
				jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonidTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_empresaTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_empresaTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_sucursalTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_sucursalTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoDescuentoUpdate")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonporcentajeTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesTarjetaCreditoDescuentoBusqueda")) {
				this.jButtonnumero_mesesTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_corrienteTarjetaCreditoDescuentoBusqueda")) {
				this.jButtones_corrienteTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_interesTarjetaCreditoDescuentoBusqueda")) {
				this.jButtoncon_interesTarjetaCreditoDescuentoBusquedaActionPerformed(evt);
			}
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTarjetaCreditoDescuento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTarjetaCreditoDescuento")) {
				closingInternalFrameTarjetaCreditoDescuento();
				
			} else if(sTipo.equals("jButtonCancelarTarjetaCreditoDescuento")) {
				JInternalFrameBase jInternalFrameDetalleFormTarjetaCreditoDescuento = (JInternalFrameBase)evt.getSource();
	            	
	            TarjetaCreditoDescuentoBeanSwingJInternalFrame jInternalFrameParent=(TarjetaCreditoDescuentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetaCreditoDescuento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTarjetaCreditoDescuentoActionPerformed(null);
			}
			
			TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tarjetacreditodescuento,new Object(),this.tarjetacreditodescuentoParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTarjetaCreditoDescuento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTarjetaCreditoDescuento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTarjetaCreditoDescuento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tarjetacreditodescuento)) {
			if(!esControlTabla) {
				if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);			
				}
				
				if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.procesarEventosTarjetaCreditoDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this.tarjetacreditodescuento,this.tarjetacreditodescuentoParameterGeneral,this.isEsNuevoTarjetaCreditoDescuento,classes);//this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral,this.tarjetacreditodescuentoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTarjetaCreditoDescuento(classes,this.tarjetacreditodescuentoReturnGeneral,this.tarjetacreditodescuentoBean,false);
					}
						
					if(this.tarjetacreditodescuentoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento());	
					}
						
					if(this.tarjetacreditodescuentoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento(),classes);//this.tarjetacreditodescuentoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoDescuento(this.tarjetacreditodescuento,classes);//this.tarjetacreditodescuentoBean);									
				}
			
				if(TarjetaCreditoDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTarjetaCreditoDescuento(this.tarjetacreditodescuento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTarjetaCreditoDescuento(this.tarjetacreditodescuento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tarjetacreditodescuentoAnterior!=null) {
						this.tarjetacreditodescuento=this.tarjetacreditodescuentoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.procesarEventosTarjetaCreditoDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this.tarjetacreditodescuento,this.tarjetacreditodescuentoParameterGeneral,this.isEsNuevoTarjetaCreditoDescuento,classes);//this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento(),tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento(),this.tarjetacreditodescuentos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTarjetaCreditoDescuento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTarjetaCreditoDescuento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTarjetaCreditoDescuento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTarjetaCreditoDescuento() throws Exception {
		
		TarjetaCreditoDescuentoModel tarjetacreditodescuentoModel=(TarjetaCreditoDescuentoModel)this.jTableDatosTarjetaCreditoDescuento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tarjetacreditodescuentoModel.tarjetacreditodescuentos=this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tarjetacreditodescuentoModel.tarjetacreditodescuentos=this.tarjetacreditodescuentos;
		}
		
		
		((TarjetaCreditoDescuentoModel) this.jTableDatosTarjetaCreditoDescuento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTarjetaCreditoDescuento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettarjetacreditodescuentoAnterior(),this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettarjetacreditodescuentoAnterior(),this.tarjetacreditodescuentos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTarjetaCreditoDescuento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
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
										
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditodescuento,new Object(),generalEntityParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TarjetaCreditoDescuentoConstantesFunciones.getClassesRelationshipsOfTarjetaCreditoDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TarjetaCreditoDescuentoConstantesFunciones.getClassesRelationshipsFromStringsOfTarjetaCreditoDescuento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTarjetaCreditoDescuento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tarjetacreditodescuento,new Object(),generalEntityParameterGeneral,this.tarjetacreditodescuentoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTarjetaCreditoDescuento(TarjetaCreditoDescuentoBean tarjetacreditodescuentoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTarjetaCreditoDescuento(ArrayList<Classe> classes,TarjetaCreditoDescuentoReturnGeneral tarjetacreditodescuentoReturnGeneral,TarjetaCreditoDescuentoBean tarjetacreditodescuentoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tarjetacreditodescuento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento = new TarjetaCreditoDescuentoDetalleFormJInternalFrame(jDesktopPane,this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones(),this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setVisible(false);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.tarjetacreditodescuentoLogic=this.tarjetacreditodescuentoLogic;
		
		this.cargarCombosFrameForeignKeyTarjetaCreditoDescuento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTarjetaCreditoDescuento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTarjetaCreditoDescuento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTarjetaCreditoDescuento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTarjetaCreditoDescuento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetaCreditoDescuento"));
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ModificarTarjetaCreditoDescuento"));

		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetaCreditoDescuento"));
					
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemModificarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetaCreditoDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"ActualizarTarjetaCreditoDescuento"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetaCreditoDescuento"));
						
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemActualizarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetaCreditoDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"EliminarTarjetaCreditoDescuento"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetaCreditoDescuento"));
								
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemEliminarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetaCreditoDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CancelarTarjetaCreditoDescuento"));
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetaCreditoDescuento"));
					
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemCancelarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetaCreditoDescuento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemDetalleCerrarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetaCreditoDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoDescuento"));
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoDescuento"));
		
		
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetaCreditoDescuento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonidTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"es_corrienteTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"con_interesTarjetaCreditoDescuentoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetaCreditoDescuento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTarjetaCreditoDescuento"));
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTarjetaCreditoDescuento"));
		}
		
		this.jTableDatosTarjetaCreditoDescuento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTarjetaCreditoDescuento"));
		
		this.jTableDatosTarjetaCreditoDescuento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTarjetaCreditoDescuento"));
		
		this.jButtonNuevoTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"NuevoTarjetaCreditoDescuento"));
		
		this.jButtonDuplicarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"DuplicarTarjetaCreditoDescuento"));
		
		this.jButtonCopiarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"CopiarTarjetaCreditoDescuento"));
		
		this.jButtonVerFormTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"VerFormTarjetaCreditoDescuento"));
		
		
		this.jButtonNuevoToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTarjetaCreditoDescuento"));
			
		this.jButtonDuplicarToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemNuevoTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTarjetaCreditoDescuento"));
			
		this.jMenuItemDuplicarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTarjetaCreditoDescuento"));		
		
		
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTarjetaCreditoDescuento"));
		
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTarjetaCreditoDescuento"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ModificarTarjetaCreditoDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonModificarToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTarjetaCreditoDescuento"));
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemModificarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTarjetaCreditoDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"ActualizarTarjetaCreditoDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonActualizarToolBarTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTarjetaCreditoDescuento"));
				
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemActualizarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTarjetaCreditoDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"EliminarTarjetaCreditoDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonEliminarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTarjetaCreditoDescuento"));
						
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemEliminarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTarjetaCreditoDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CancelarTarjetaCreditoDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonCancelarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTarjetaCreditoDescuento"));
			
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemCancelarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTarjetaCreditoDescuento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTarjetaCreditoDescuento"));		
		
		
		this.jButtonCerrarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CerrarTarjetaCreditoDescuento"));
		
		
		this.jButtonCerrarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemCerrarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTarjetaCreditoDescuento"));
			
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jMenuItemDetalleCerrarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTarjetaCreditoDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTarjetaCreditoDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTarjetaCreditoDescuento"));
		}
		
		this.jButtonCopiarToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTarjetaCreditoDescuento"));
			
		this.jButtonVerFormToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTarjetaCreditoDescuento"));
		
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTarjetaCreditoDescuento"));
			
		this.jMenuItemCopiarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTarjetaCreditoDescuento"));		
		
		this.jMenuItemVerFormTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTarjetaCreditoDescuento"));		
		
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetaCreditoDescuento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTarjetaCreditoDescuento"));		
		
		
		
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTarjetaCreditoDescuento"));
					
		this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTarjetaCreditoDescuento"));
		
		this.jMenuItemRecargarInformacionTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTarjetaCreditoDescuento"));		
		
		
		
		this.jButtonAnterioresTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"AnterioresTarjetaCreditoDescuento"));
		
		
		this.jButtonAnterioresToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTarjetaCreditoDescuento"));
		
		this.jMenuItemAnterioresTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTarjetaCreditoDescuento"));		
		
		
		this.jButtonSiguientesTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"SiguientesTarjetaCreditoDescuento"));
		
		
		this.jButtonSiguientesToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemSiguientesTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTarjetaCreditoDescuento"));
			
		this.jMenuItemAbrirOrderByTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTarjetaCreditoDescuento"));
			
		this.jMenuItemMostrarOcultarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTarjetaCreditoDescuento"));
			
		this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTarjetaCreditoDescuento"));
			
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTarjetaCreditoDescuento"));		
		
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTarjetaCreditoDescuento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTarjetaCreditoDescuento"));
			
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTarjetaCreditoDescuento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTarjetaCreditoDescuento"));

		this.jCheckBoxSeleccionadosTarjetaCreditoDescuento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTarjetaCreditoDescuento"));
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTarjetaCreditoDescuento"));
		}
		
		
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTarjetaCreditoDescuento"));
			
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesTarjetaCreditoDescuento"));
					
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTarjetaCreditoDescuento"));
			
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTarjetaCreditoDescuento"));		
		
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonidTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"es_corrienteTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"con_interesTarjetaCreditoDescuentoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"FK_IdTarjetaCreditoTarjetaCreditoDescuento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento!=null) {
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoDescuento"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoDescuento"));
				this.jInternalFrameReporteDinamicoTarjetaCreditoDescuento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoDescuento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTarjetaCreditoDescuento"));				
			//this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTarjetaCreditoDescuento"));
			//this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTarjetaCreditoDescuento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTarjetaCreditoDescuento!=null) {
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTarjetaCreditoDescuento"));
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTarjetaCreditoDescuento"));
				this.jInternalFrameImportacionTarjetaCreditoDescuento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTarjetaCreditoDescuento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTarjetaCreditoDescuento"));
			
			this.jButtonAbrirOrderByToolBarTarjetaCreditoDescuento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTarjetaCreditoDescuento"));			
			
			if(this.jInternalFrameOrderByTarjetaCreditoDescuento!=null) {
				this.jInternalFrameOrderByTarjetaCreditoDescuento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTarjetaCreditoDescuento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTabbedPaneRelacionesTarjetaCreditoDescuento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTarjetaCreditoDescuento"));
		
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
            		closingInternalFrameTarjetaCreditoDescuento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTarjetaCreditoDescuento = (JInternalFrameBase)event.getSource();
	            	
	            TarjetaCreditoDescuentoBeanSwingJInternalFrame jInternalFrameParent=(TarjetaCreditoDescuentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTarjetaCreditoDescuento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTarjetaCreditoDescuentoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTarjetaCreditoDescuento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTarjetaCreditoDescuentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTarjetaCreditoDescuento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTarjetaCreditoDescuento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoRelacionesTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTarjetaCreditoDescuentoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTarjetaCreditoDescuento";
		inputMap = this.jButtonModificarTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTarjetaCreditoDescuento";
		inputMap = this.jButtonActualizarTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTarjetaCreditoDescuento";
		inputMap = this.jButtonEliminarTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTarjetaCreditoDescuento";
		inputMap = this.jButtonCancelarTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTarjetaCreditoDescuento";
		inputMap = this.jButtonCerrarTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTarjetaCreditoDescuento";
		inputMap = this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonGuardarCambiosTarjetaCreditoDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTarjetaCreditoDescuento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTarjetaCreditoDescuentoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTarjetaCreditoDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTarjetaCreditoDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTarjetaCreditoDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonidTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTarjetaCreditoDescuentoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"es_corrienteTarjetaCreditoDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"con_interesTarjetaCreditoDescuentoBusqueda"));
		
		
		this.jButtonFK_IdTarjetaCreditoTarjetaCreditoDescuento.addActionListener(new ButtonActionListener(this,"FK_IdTarjetaCreditoTarjetaCreditoDescuento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTarjetaCreditoDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTarjetaCreditoDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTarjetaCreditoDescuentoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTarjetaCreditoDescuento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTarjetaCreditoDescuento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
					tarjetacreditodescuentoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentos) {
					tarjetacreditodescuentoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTarjetaCreditoDescuentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
						tarjetacreditodescuentoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentos) {
						tarjetacreditodescuentoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
					
						if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE)) {
							existe=true;
							tarjetacreditodescuentoAux.setes_corriente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES)) {
							existe=true;
							tarjetacreditodescuentoAux.setcon_interes(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentos) {
						
						if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE)) {
							existe=true;
							tarjetacreditodescuentoAux.setes_corriente(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES)) {
							existe=true;
							tarjetacreditodescuentoAux.setcon_interes(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetaCreditoDescuento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetaCreditoDescuento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTarjetaCreditoDescuentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTarjetaCreditoDescuento.getSelectedRows();
			
			TarjetaCreditoDescuento tarjetacreditodescuentoLocal=new TarjetaCreditoDescuento();
			
			//this.seleccionarTodosTarjetaCreditoDescuento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tarjetacreditodescuentoLocal =(TarjetaCreditoDescuento) this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos().toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tarjetacreditodescuentoLocal =(TarjetaCreditoDescuento) this.tarjetacreditodescuentos.toArray()[this.jTableDatosTarjetaCreditoDescuento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tarjetacreditodescuentoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
						tarjetacreditodescuentoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentos) {
						tarjetacreditodescuentoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTarjetaCreditoDescuento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTarjetaCreditoDescuento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTarjetaCreditoDescuento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTarjetaCreditoDescuentoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTarjetaCreditoDescuentoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTarjetaCreditoDescuentoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTarjetaCreditoDescuento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
				
						if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tarjetacreditodescuentoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							tarjetacreditodescuentoAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentos) {
					
						if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							tarjetacreditodescuentoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							tarjetacreditodescuentoAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTarjetaCreditoDescuentoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTarjetaCreditoDescuento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTarjetaCreditoDescuento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTarjetaCreditoDescuento) {				
					conSplash=true;//false;										
					
					//this.startProcessTarjetaCreditoDescuento(conSplash);
				
					this.generarReporteTarjetaCreditoDescuentosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTarjetaCreditoDescuentosSeleccionados();
				//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetaCreditoDescuentosSeleccionados(false);
				//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTarjetaCreditoDescuentosSeleccionados(true);
				//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetaCreditoDescuento();
				
				this.exportarTarjetaCreditoDescuentosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTarjetaCreditoDescuentos();
				//this.importarTarjetaCreditoDescuentos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTarjetaCreditoDescuento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTarjetaCreditoDescuentosSeleccionados();
				//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tarjeta Credito Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTarjetaCreditoDescuento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTarjetaCreditoDescuento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTarjetaCreditoDescuento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
				}	
			} 			
			else if(TarjetaCreditoDescuentoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTarjetaCreditoDescuento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTarjetaCreditoDescuento(conSplash);
					
						//this.actualizarParametrosGeneralTarjetaCreditoDescuento();
						
						this.generarReporteProcesoAccionTarjetaCreditoDescuentosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tarjeta Credito DescuentoS SELECCIONADOS?", "MANTENIMIENTO DE Tarjeta Credito Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTarjetaCreditoDescuento();
				
						this.actualizarParametrosGeneralTarjetaCreditoDescuento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tarjetacreditodescuentoReturnGeneral=tarjetacreditodescuentoLogic.procesarAccionTarjetaCreditoDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos(),this.tarjetacreditodescuentoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTarjetaCreditoDescuentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTarjetaCreditoDescuento();
					
					TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTarjetaCreditoDescuentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTarjetaCreditoDescuento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTarjetaCreditoDescuentoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTarjetaCreditoDescuento();
			
			if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
			TarjetaCreditoDescuento tarjetacreditodescuento=new TarjetaCreditoDescuento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTarjetaCreditoDescuento.getSelectedItem();
			
			
			
			
			tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tarjetacreditodescuentosSeleccionados.size()==1) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
					tarjetacreditodescuento=tarjetacreditodescuentoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTarjetaCreditoDescuento();
			
      		//this.finishProcessTarjetaCreditoDescuento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTarjetaCreditoDescuentoReturnGeneral() throws Exception {
		if(this.tarjetacreditodescuentoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tarjetacreditodescuentoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tarjetacreditodescuentoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tarjetacreditodescuentoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tarjetacreditodescuentoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tarjetacreditodescuentoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
		}
		
		if(this.tarjetacreditodescuentoReturnGeneral.getConRetornoLista() || this.tarjetacreditodescuentoReturnGeneral.getConRetornoObjeto()) {
			if(this.tarjetacreditodescuentoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tarjetacreditodescuentoLogic.setTarjetaCreditoDescuentos(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tarjetacreditodescuentoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tarjetacreditodescuentoLogic.setTarjetaCreditoDescuento(this.tarjetacreditodescuentoReturnGeneral.getTarjetaCreditoDescuento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTarjetaCreditoDescuento(false);
		}
	}
	
	public void actualizarParametrosGeneralTarjetaCreditoDescuento() throws Exception {
		
		
	}
	
	public ArrayList<TarjetaCreditoDescuento> getTarjetaCreditoDescuentosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTarjetaCreditoDescuento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos()) {
					if(tarjetacreditodescuentoAux.getIsSelected()) {
						tarjetacreditodescuentosSeleccionados.add(tarjetacreditodescuentoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:this.tarjetacreditodescuentos) {
					if(tarjetacreditodescuentoAux.getIsSelected()) {
						tarjetacreditodescuentosSeleccionados.add(tarjetacreditodescuentoAux);				
					}
				}
			}
			
			if(tarjetacreditodescuentosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tarjetacreditodescuentosSeleccionados.addAll(this.tarjetacreditodescuentoLogic.getTarjetaCreditoDescuentos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tarjetacreditodescuentosSeleccionados.addAll(this.tarjetacreditodescuentos);				
					}
				}
			}
		} else {
			tarjetacreditodescuentosSeleccionados.add(this.tarjetacreditodescuento);
		}
		
		return tarjetacreditodescuentosSeleccionados;
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
	
	public void generarReporteTarjetaCreditoDescuentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTarjetaCreditoDescuentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTarjetaCreditoDescuentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetaCreditoDescuentosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTarjetaCreditoDescuentosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tarjeta Credito Descuento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados);
		
	}	
	
	public void generarReporteNormalTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTarjetaCreditoDescuentosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTarjetaCreditoDescuento();
		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTarjetaCreditoDescuento();
		
		
		//this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados ,tarjetacreditodescuentoImplementable,tarjetacreditodescuentoImplementableHome);
	}
	
	public void mostrarImportacionTarjetaCreditoDescuentos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTarjetaCreditoDescuento();
		
		this.abrirFrameImportacionTarjetaCreditoDescuento();		
		
			
		//this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados ,tarjetacreditodescuentoImplementable,tarjetacreditodescuentoImplementableHome);
	}
	
	public void importarTarjetaCreditoDescuentos() throws Exception {		
	
	}
	
	public void exportarTarjetaCreditoDescuentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTarjetaCreditoDescuentosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTarjetaCreditoDescuentosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTarjetaCreditoDescuentosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tarjeta Credito Descuento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTarjetaCreditoDescuento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTarjetaCreditoDescuento(tarjetacreditodescuentoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tarjetacreditodescuentoAux.setsDetalleGeneralEntityReporte(tarjetacreditodescuentoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTarjetaCreditoDescuento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tarjetacreditodescuento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.gettarjetacredito_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getnumero_meses().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getes_corriente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tarjetacreditodescuento.getcon_interes().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TarjetaCreditoDescuentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTarjetaCreditoDescuento(row);				
				iRow++;
			}				
			
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTarjetaCreditoDescuento(tarjetacreditodescuentoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTarjetaCreditoDescuentosSeleccionados() throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();		
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tarjetacreditodescuento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tarjetacreditodescuentos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tarjetacreditodescuento");
			//elementRoot.appendChild(element);
		
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
				element = document.createElement("tarjetacreditodescuento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTarjetaCreditoDescuento(tarjetacreditodescuentoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tarjeta Credito Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTarjetaCreditoDescuento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.gettarjetacredito_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getnumero_meses());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getes_corriente());
		cell = row.createCell(iColumn++);cell.setCellValue(tarjetacreditodescuento.getcon_interes());				
	}
	
	public void setFilaDatosExportarXmlTarjetaCreditoDescuento(TarjetaCreditoDescuento tarjetacreditodescuento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tarjetacreditodescuento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tarjetacreditodescuento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tarjetacreditodescuento.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tarjetacreditodescuento.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtarjetacredito_descripcion = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.IDTARJETACREDITO);
		elementtarjetacredito_descripcion.appendChild(document.createTextNode(tarjetacreditodescuento.gettarjetacredito_descripcion()));
		element.appendChild(elementtarjetacredito_descripcion);

		Element elementporcentaje = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(tarjetacreditodescuento.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementnumero_meses = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.NUMEROMESES);
		elementnumero_meses.appendChild(document.createTextNode(tarjetacreditodescuento.getnumero_meses().toString().trim()));
		element.appendChild(elementnumero_meses);

		Element elementes_corriente = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.ESCORRIENTE);
		elementes_corriente.appendChild(document.createTextNode(tarjetacreditodescuento.getes_corriente().toString().trim()));
		element.appendChild(elementes_corriente);

		Element elementcon_interes = document.createElement(TarjetaCreditoDescuentoConstantesFunciones.CONINTERES);
		elementcon_interes.appendChild(document.createTextNode(tarjetacreditodescuento.getcon_interes().toString().trim()));
		element.appendChild(elementcon_interes);
	}
	
	public void generarReporteGroupGenericoTarjetaCreditoDescuentosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados=new ArrayList<TarjetaCreditoDescuento>();
		
		tarjetacreditodescuentosSeleccionados=this.getTarjetaCreditoDescuentosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTarjetaCreditoDescuento(tarjetacreditodescuentosSeleccionados);
		
		this.generarReporteTarjetaCreditoDescuentos("Todos",tarjetacreditodescuentosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTarjetaCreditoDescuento(ArrayList<TarjetaCreditoDescuento> tarjetacreditodescuentosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TarjetaCreditoDescuento tarjetacreditodescuentoAux:tarjetacreditodescuentosSeleccionados) {
				tarjetacreditodescuentoAux.setsDetalleGeneralEntityReporte(tarjetacreditodescuentoAux.toString());
			
				if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(tarjetacreditodescuentoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(tarjetacreditodescuentoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(tarjetacreditodescuentoAux.gettarjetacredito_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(tarjetacreditodescuentoAux.getnumero_meses().toString());
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tarjetacreditodescuentoAux.getes_corriente()));
				}
				 else if(sTipoSeleccionar.equals(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES)) {
					existe=true;
					tarjetacreditodescuentoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tarjetacreditodescuentoAux.getcon_interes()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TarjetaCreditoDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTarjetaCreditoDescuento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=true;
				this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=true;
				this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=true;
			}
			
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaModificarTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaCancelarTarjetaCreditoDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTarjetaCreditoDescuento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=true;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=true;
		} else {
			this.actualizarEstadoPanelsTarjetaCreditoDescuento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTarjetaCreditoDescuento=false;
			//this.isVisibilidadCeldaVerFormTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaDuplicarTarjetaCreditoDescuento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
		} else {
			this.isVisibilidadCeldaNuevoTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTarjetaCreditoDescuento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			if(!tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;												
			}
			
			this.jButtonCerrarTarjetaCreditoDescuento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTarjetaCreditoDescuento=false;
		}
		
		if(!this.permiteMantenimiento(this.tarjetacreditodescuento)) {
			this.isVisibilidadCeldaActualizarTarjetaCreditoDescuento=false;
			this.isVisibilidadCeldaEliminarTarjetaCreditoDescuento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTarjetaCreditoDescuento() {
	}
	
	public void actualizarEstadoPanelsTarjetaCreditoDescuento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTarjetaCreditoDescuento!=null) {
				this.jScrollPanelDatosTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTarjetaCreditoDescuento!=null) {
				this.jPanelPaginacionTarjetaCreditoDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
					this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento!=null) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTarjetaCreditoDescuento!=null) {
				this.jPanelParametrosReportesTarjetaCreditoDescuento.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTarjetaCredito=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoDescuento.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTarjetaCredito=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoDescuento.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);}
		}
		
	}

	public void setVisibilidadBusquedasParaTarjetaCredito(Boolean isParaTarjetaCredito){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTarjetaCreditoNegation=!isParaTarjetaCredito;

			this.isVisibilidadFK_IdTarjetaCredito=isParaTarjetaCredito;
			if(!this.isVisibilidadFK_IdTarjetaCredito) {this.jTabbedPaneBusquedasTarjetaCreditoDescuento.remove(jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		
		if(this.tarjetacreditodescuentoSessionBean==null) {
			this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		}
		
		this.tarjetacreditodescuentoSessionBean.setsUltimaBusquedaTarjetaCreditoDescuento(this.getsAccionBusqueda());
		this.tarjetacreditodescuentoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tarjetacreditodescuentoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tarjetacreditodescuentoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			tarjetacreditodescuentoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTarjetaCredito")) {
			tarjetacreditodescuentoSessionBean.setid_tarjeta_credito(this.getid_tarjeta_creditoFK_IdTarjetaCredito());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		
		if(this.tarjetacreditodescuentoSessionBean==null) {
			this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		}
		
		if(this.tarjetacreditodescuentoSessionBean.getsUltimaBusquedaTarjetaCreditoDescuento()!=null&&!this.tarjetacreditodescuentoSessionBean.getsUltimaBusquedaTarjetaCreditoDescuento().equals("")) {
			this.setsAccionBusqueda(tarjetacreditodescuentoSessionBean.getsUltimaBusquedaTarjetaCreditoDescuento());
			this.setiNumeroPaginacion(tarjetacreditodescuentoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tarjetacreditodescuentoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tarjetacreditodescuentoSessionBean.getid_empresa());
				tarjetacreditodescuentoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(tarjetacreditodescuentoSessionBean.getid_sucursal());
				tarjetacreditodescuentoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTarjetaCredito")) {
				this.setid_tarjeta_creditoFK_IdTarjetaCredito(tarjetacreditodescuentoSessionBean.getid_tarjeta_credito());
				tarjetacreditodescuentoSessionBean.setid_tarjeta_credito(-1L);
			}
		}
		
		this.tarjetacreditodescuentoSessionBean.setsUltimaBusquedaTarjetaCreditoDescuento("");
		this.tarjetacreditodescuentoSessionBean.setiNumeroPaginacion(TarjetaCreditoDescuentoConstantesFunciones.INUMEROPAGINACION);
		this.tarjetacreditodescuentoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTarjetaCreditoDescuento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTarjetaCreditoDescuento() {
		this.updateBorderResaltarBusquedasFormularioTarjetaCreditoDescuento();
		this.updateVisibilidadBusquedasFormularioTarjetaCreditoDescuento();
		this.updateHabilitarBusquedasFormularioTarjetaCreditoDescuento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTarjetaCreditoDescuento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponents().length>0) {
	

		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoDescuento!=null) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoDescuento.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponent(index);
				jPanel.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTarjetaCreditoDescuento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetaCreditoDescuento.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			if(!this.tarjetacreditodescuentoConstantesFunciones.mostrarFK_IdTarjetaCreditoTarjetaCreditoDescuento && index>-1) {
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTarjetaCreditoDescuento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTarjetaCreditoDescuento.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarFK_IdTarjetaCreditoTarjetaCreditoDescuento);
				this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setEnabledAt(index,this.tarjetacreditodescuentoConstantesFunciones.activarFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTarjetaCreditoDescuento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTarjetaCredito")) {
			index= this.jTabbedPaneBusquedasTarjetaCreditoDescuento.indexOfComponent(this.jPanelFK_IdTarjetaCreditoTarjetaCreditoDescuento);

			this.jTabbedPaneBusquedasTarjetaCreditoDescuento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTarjetaCreditoDescuento.getComponent(index);

			this.tarjetacreditodescuentoConstantesFunciones.setResaltarFK_IdTarjetaCreditoTarjetaCreditoDescuento(resaltar);

			jPanel.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarFK_IdTarjetaCreditoTarjetaCreditoDescuento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTarjetaCreditoDescuento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTarjetaCreditoDescuento() throws Exception {

		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTarjetaCreditoDescuento();
		this.updateVisibilidadResaltarControlesFormularioTarjetaCreditoDescuento();
		this.updateHabilitarResaltarControlesFormularioTarjetaCreditoDescuento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTarjetaCreditoDescuento() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltaridTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltaridTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_empresaTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_empresaTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_sucursalTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_sucursalTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarid_tarjeta_creditoTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarporcentajeTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarporcentajeTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarnumero_mesesTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarnumero_mesesTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltares_corrienteTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setBorderPainted(true);this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltares_corrienteTarjetaCreditoDescuento);}
		if(this.tarjetacreditodescuentoConstantesFunciones.resaltarcon_interesTarjetaCreditoDescuento!=null && this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setBorderPainted(true);this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setBorder(this.tarjetacreditodescuentoConstantesFunciones.resaltarcon_interesTarjetaCreditoDescuento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTarjetaCreditoDescuento() throws Exception {		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
	
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostraridTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelidTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostraridTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_empresaTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelid_empresaTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_empresaTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_sucursalTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelid_sucursalTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_sucursalTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarid_tarjeta_creditoTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarporcentajeTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelporcentajeTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarporcentajeTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarnumero_mesesTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelnumero_mesesTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarnumero_mesesTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrares_corrienteTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPaneles_corrienteTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrares_corrienteTarjetaCreditoDescuento);
		//this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarcon_interesTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jPanelcon_interesTarjetaCreditoDescuento.setVisible(this.tarjetacreditodescuentoConstantesFunciones.mostrarcon_interesTarjetaCreditoDescuento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTarjetaCreditoDescuento() throws Exception {
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTarjetaCreditoDescuento!=null) {
	
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jLabelidTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activaridTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_empresaTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarid_empresaTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_sucursalTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarid_sucursalTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarid_tarjeta_creditoTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldporcentajeTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarporcentajeTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jTextFieldnumero_mesesTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarnumero_mesesTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxes_corrienteTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activares_corrienteTarjetaCreditoDescuento);
		this.jInternalFrameDetalleFormTarjetaCreditoDescuento.jCheckBoxcon_interesTarjetaCreditoDescuento.setEnabled(this.tarjetacreditodescuentoConstantesFunciones.activarcon_interesTarjetaCreditoDescuento);
		}
	}
	
		
}